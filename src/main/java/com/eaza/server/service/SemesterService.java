package com.eaza.server.service;

import com.eaza.server.mapper.SectionMapper;
import com.eaza.server.model.CourseOffering;
import com.eaza.server.model.Instructor;
import com.eaza.server.model.VO.Section;
import com.eaza.server.model.VO.Semester;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class SemesterService {
    @Resource
    private GradeService gradeService;
    @Resource
    private CourseService courseService;
    @Resource
    private InstructorService instructorService;
    @Resource
    private SectionMapper sectionMapper;

    public List<Semester> getSemesters(String uuid) {
        var ids = courseService.getOfferId(uuid);
        var semesters = new ArrayList<Semester>();
        for (var id : ids) {
            var sections = getSectionsByOfferId(id);
            var term = courseService.getTerm(id).getTermCode();
            var semester = new Semester(sections, term);
            semesters.add(semester);
        }
        return semesters;
    }

    @Cacheable(value = "getSectionByOfferId")
    public List<Section> getSectionsByOfferId(String offerId) {
        var grades = gradeService.getGradesByOfferId(offerId);
        var sections = new ArrayList<Section>();
        for (var grade : grades) {
            var instructors = getInstructorsByOfferIdAndSecNum(offerId, grade.getSectionNumber());
            var section = new Section(grade, instructors);
            sections.add(section);
        }
        return sections;
    }

    @Cacheable(value = "getSectionIdByOfferId")
    public List<String> getSectionIdByOfferId(String offerId, int number) {
        return sectionMapper.getSectionIdByOfferIdNNum(offerId, number);
    }

    @Cacheable(value = "getInstructorsByOfferId")
    public List<Instructor> getInstructorsByOfferIdAndSecNum(String offerId, int sectionNum) {
        // get all section id
        var ids = getSectionIdByOfferId(offerId, sectionNum);
        var instructors = new ArrayList();
        var set = new HashSet<>();
        for (var id : ids) {
            var instructorId = instructorService.getInstructorIdBySectionId(id);
            if (!set.contains(instructorId)) {
                var instructor = instructorService.getInstructorById(instructorId);
                instructors.add(instructor);
                set.add(instructorId);
            }
        }
        return instructors;
    }
}
