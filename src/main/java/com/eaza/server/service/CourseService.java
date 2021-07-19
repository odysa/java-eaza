package com.eaza.server.service;

import com.eaza.server.mapper.CourseMapper;
import com.eaza.server.mapper.CourseOfferingMapper;
import com.eaza.server.model.Course;

import com.eaza.server.model.POJO.Term;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseOfferingMapper courseOfferingMapper;
    @Cacheable(value = "getCourse")
    public Course course(String uuid){
        return courseMapper.selectByUuid(uuid);
    }
    @Cacheable(value = "getOfferId")
    public List<String> getOfferId(String uuid){
        return courseOfferingMapper.getOfferIdByCourseUuid(uuid);
    }
    @Cacheable(value = "getTerm")
    public List<Term> getTerm(String uuid){
        return courseOfferingMapper.getTermByUuid(uuid);
    }
}
