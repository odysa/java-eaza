package com.eaza.server.controller;

import com.eaza.server.response.ApiResponse;
import com.eaza.server.service.CourseService;
import com.eaza.server.service.GradeService;
import com.eaza.server.service.SemesterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Api(tags = "course")
@Controller
@RequestMapping("/course")
@ResponseBody
public class CourseController {
    @Resource
    private CourseService courseService;

    @Resource
    private GradeService gradeService;

    @Resource
    private SemesterService semesterService;

    @ApiOperation("course detail")
    @GetMapping("/{uuid}")
    public ApiResponse getCourseByUuid(@PathVariable String uuid) {
        return new ApiResponse(courseService.getCourseByUuid(uuid));
    }

}
