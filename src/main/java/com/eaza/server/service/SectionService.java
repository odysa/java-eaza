package com.eaza.server.service;

import com.eaza.server.mapper.SectionMapper;
import com.eaza.server.model.Instructor;
import com.eaza.server.model.VO.Section;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class SectionService {
    @Resource
    private GradeService gradeService;
    @Resource
    private SubjectService subjectService;
    @Resource
    private CourseService courseService;
    @Resource
    private InstructorService instructorService;
    @Resource
    private SectionMapper sectionMapper;

    @Cacheable(value = "getSectionsByUuid")
    public List<Section> getSectionsByUuid(String uuid){
        var sections = new ArrayList();

        var terms = courseService.getTerm(uuid);

        for(var term:terms){
            var offerId = term.getOfferId();
            var section = getSectionByOfferId(offerId,term.getTermCode());
            sections.add(section);
        }
        return sections;
    }

    @Cacheable(value = "getSectionByOfferId")
    public Section getSectionByOfferId(String offerId, int code){
        var grade = gradeService.getGradeByOfferId(offerId);
        var subjects = subjectService.getSubjectsByOfferId(offerId);
        var instructors = getInstructorsByOfferId(offerId);
        return new Section(grade, subjects, instructors, code);
    }

    @Cacheable(value ="getSectionIdByOfferId")
    public List<String> getSectionIdByOfferId(String offerId){
        return sectionMapper.getSectionIdByOfferId(offerId);
    }

    @Cacheable(value = "getInstructorsByOfferId")
    public List<Instructor> getInstructorsByOfferId(String offerId){
        var ids = getSectionIdByOfferId(offerId);
        var instructors = new ArrayList();
        var set = new HashSet<>();
        for(var id:ids){
            var instructorId  = instructorService.getInstructorIdBySectionId(id);
            if(!set.contains(instructorId)){
                var instructor = instructorService.getInstructorById(instructorId);
                instructors.add(instructor);
                set.add(instructorId);
            }
        }
        return instructors;
    }
}
