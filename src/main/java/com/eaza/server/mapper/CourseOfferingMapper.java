package com.eaza.server.mapper;

import com.eaza.server.model.CourseOffering;
import com.eaza.server.model.CourseOfferingExample;
import java.util.List;

import com.eaza.server.model.POJO.Term;
import org.apache.ibatis.annotations.Param;

public interface CourseOfferingMapper {
    long countByExample(CourseOfferingExample example);

    int deleteByExample(CourseOfferingExample example);

    int insert(CourseOffering record);

    int insertSelective(CourseOffering record);

    List<CourseOffering> selectByExample(CourseOfferingExample example);

    int updateByExampleSelective(@Param("record") CourseOffering record, @Param("example") CourseOfferingExample example);

    int updateByExample(@Param("record") CourseOffering record, @Param("example") CourseOfferingExample example);

    List<String> getOfferIdByCourseUuid(String uuid);

    List<Term> getTermByUuid(String uuid);

    Term getTermByOfferId(String offerId);
}