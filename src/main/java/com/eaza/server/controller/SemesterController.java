package com.eaza.server.controller;

import com.eaza.server.model.VO.Section;
import com.eaza.server.model.VO.Semester;
import com.eaza.server.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class SemesterController {
    @Autowired
    private SemesterService semesterService;

    @GetMapping("/semester/{uuid}")
    public List<Semester> getSemesterByUuid(@PathVariable String uuid) {
        return semesterService.getSemesters(uuid);
    }
}