package com.eaza.server.controller;

import com.eaza.server.model.VO.Section;
import com.eaza.server.service.GradeService;
import com.eaza.server.service.SectionService;
import com.eaza.server.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class SectionController {
    @Autowired
    private SectionService sectionService;

    @GetMapping("/sections/{uuid}")
    public List<Section> getSectionsByUuid(@PathVariable String uuid){
        return sectionService.getSectionsByUuid(uuid);
    }
}