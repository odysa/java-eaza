package com.eaza.server.controller;

import com.eaza.server.model.Course;
import com.eaza.server.model.Grade;
import com.eaza.server.model.VO.Section;
import com.eaza.server.service.CourseService;
import com.eaza.server.service.GradeService;
import com.eaza.server.service.SectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "course")
@Controller
@RequestMapping("/course")
@ResponseBody
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private GradeService gradeService;

    @Autowired
    private SectionService sectionService;

    @ApiOperation("course detail")
    @GetMapping("/{uuid}")
    public Course getCourseByUuid(@PathVariable String uuid){
        return courseService.getCourseByUuid(uuid);
    }

}
