package com.eaza.server.controller;

import com.eaza.server.model.Course;
import com.eaza.server.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course/{uuid}")
    public List<String> getCourseByUuid(@PathVariable String uuid){
        return courseService.getOfferId(uuid);
    }
}
