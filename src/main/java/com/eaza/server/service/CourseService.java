package com.eaza.server.service;

import com.eaza.server.mapper.CourseMapper;
import com.eaza.server.mapper.CourseOfferingMapper;
import com.eaza.server.model.Course;

import com.eaza.server.model.POJO.Term;
import com.eaza.server.model.VO.SearchResult;
import com.eaza.server.request.SearchRequest;
import com.eaza.server.response.PageResponse;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {
    @Resource
    private CourseMapper courseMapper;
    @Resource
    private CourseOfferingMapper courseOfferingMapper;

    @Cacheable(value = "getCourse")
    public Course getCourseByUuid(String uuid) {
        return courseMapper.selectByUuid(uuid);
    }

    @Cacheable(value = "getOfferId")
    public List<String> getOfferId(String uuid) {
        return courseOfferingMapper.getOfferIdByCourseUuid(uuid);
    }

    @Cacheable(value = "getTerm")
    public Term getTerm(String offerId) {
        return courseOfferingMapper.getTermByOfferId(offerId);
    }

    public List<Term> getTermsByUuid(String uuid) {
        return courseOfferingMapper.getTermByUuid(uuid);
    }

    @Cacheable(value = "searchByQuery")
    public PageResponse search(SearchRequest request) {
        PageHelper.startPage(request.getPage(), request.getSize());
        var result = courseMapper.searchByQuery(request.getQuery());
        var pageInfo = new PageInfo<>(result);
        var response = new PageResponse(result, pageInfo.getTotal(), request.getPage());
        return response;
    }
}
