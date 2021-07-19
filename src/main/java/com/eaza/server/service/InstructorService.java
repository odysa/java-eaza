package com.eaza.server.service;

import com.eaza.server.mapper.InstructorMapper;
import com.eaza.server.model.Instructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InstructorService {
    @Resource
    private InstructorMapper instructorMapper;

    @Cacheable(value = "getInstructorBySectionId")
    public Instructor getInstructorBySectionId(String sectionId){
        var id = getInstructorIdBySectionId(sectionId);
        return getInstructorById(id);
    }

    @Cacheable(value = "getInstructorById")
    public Instructor getInstructorById(int id){
        return instructorMapper.getInstructorById(id);
    }

    @Cacheable(value = "getInstructorIdBySectionId")
    public int getInstructorIdBySectionId(String id){
        return instructorMapper.getIdBySectionId(id);
    }
}
