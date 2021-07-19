package com.eaza.server.controller;

import com.eaza.server.model.Course;
import com.eaza.server.model.Grade;
import com.eaza.server.service.CourseService;
import com.eaza.server.service.GradeService;
import com.eaza.server.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
public class GradeController {
    @Autowired
    private GradeService gradeService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/grade/{id}")
    public Grade getGradeByOfferId(@PathVariable String id){
        return gradeService.getGradeByOfferId(id);
    }

    @GetMapping("/grades/{uuid}")
    public List<Grade> getGradesByUuid(@PathVariable String uuid){
        return gradeService.getGradesByUuid(uuid);
    }

}
