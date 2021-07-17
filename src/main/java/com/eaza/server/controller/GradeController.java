package com.eaza.server.controller;

import com.eaza.server.model.Course;
import com.eaza.server.model.Grade;
import com.eaza.server.service.CourseService;
import com.eaza.server.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @GetMapping("/grade/{id}")
    public Grade getCourseByUuid(@PathVariable String id){
        return gradeService.getGradeByOfferId(id);
    }
}
