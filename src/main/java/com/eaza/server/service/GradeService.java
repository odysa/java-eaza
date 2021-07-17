package com.eaza.server.service;

import com.eaza.server.mapper.GradeMapper;
import com.eaza.server.model.Grade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GradeService {

    @Resource
    private GradeMapper gradeMapper;
    // by offer id
    public Grade getGradeByOfferId(String offerId){
        return gradeMapper.getGradeByOfferId(offerId);
    }
}
