package com.eaza.server.controller;

import com.eaza.server.request.SearchRequest;
import com.eaza.server.response.ApiResponse;
import com.eaza.server.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("search")
@Controller
@ResponseBody
public class SearchController {
    @Resource
    private CourseService courseService;

    @GetMapping("")
    public ApiResponse search(SearchRequest request) {
        return new ApiResponse(courseService.search(request));
    }
}