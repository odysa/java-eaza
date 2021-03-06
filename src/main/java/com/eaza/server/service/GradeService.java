package com.eaza.server.service;

import com.eaza.server.mapper.GradeMapper;
import com.eaza.server.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeMapper gradeMapper;
    @Autowired
    private CourseService courseService;
    @Autowired
    private SubjectService subjectService;

    // by offer id
//    @Cacheable(value = "getGradeByOfferId")
    public List<Grade> getGradesByOfferId(String offerId) {
        return gradeMapper.getGradesByOfferId(offerId);
    }

    @Cacheable(value = "getGradesByUuid")
    public List<Grade> getGradesByUuid(@PathVariable String uuid) {
        var grades = new ArrayList<Grade>();
        var offers = courseService.getOfferId(uuid);

        for (var offer : offers) {
            var gradeList = getGradesByOfferId(offer);
            for (var grade : gradeList) {
                grades.add(grade);
            }
        }
        return grades;
    }
}
