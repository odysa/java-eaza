package com.eaza.server.service;

import com.eaza.server.mapper.CourseMapper;
import com.eaza.server.mapper.CourseOfferingMapper;
import com.eaza.server.model.Course;
import com.eaza.server.model.CourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseOfferingMapper courseOfferingMapper;

    public Course course(String uuid){
        return courseMapper.selectByUuid(uuid);
    }

    public List<String> getOfferId(String uuid){
        return courseOfferingMapper.getOfferIdByCourseUuid(uuid);
    }
}
