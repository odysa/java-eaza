package com.eaza.server.service;

import com.eaza.server.mapper.SubjectMapper;
import com.eaza.server.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectMapper subjectMapper;

    @Cacheable(value = "getSubjectCodes")
    public List<String> getSubjectCodes(String offerId){
        return subjectMapper.getCodesByOfferId(offerId);
    }

    @Cacheable(value = "getSubject")
    public Subject getSubject(String code){
        return subjectMapper.getSubjectByCode(code);
    }

    @Cacheable(value = "getSubjectsByOfferId")
    public List<Subject> getSubjectsByOfferId(String offerId){
        var subjects = new ArrayList();
        var codes = getSubjectCodes(offerId);
        for(var code:codes){
            var subject = getSubject(code);
            subjects.add(subject);
        }
        return subjects;
    }
}
