package com.eaza.server.mapper;

import com.eaza.server.model.Instructor;
import com.eaza.server.model.InstructorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstructorMapper {
    long countByExample(InstructorExample example);

    int deleteByExample(InstructorExample example);

    int insert(Instructor record);

    int insertSelective(Instructor record);

    List<Instructor> selectByExample(InstructorExample example);

    int updateByExampleSelective(@Param("record") Instructor record, @Param("example") InstructorExample example);

    int updateByExample(@Param("record") Instructor record, @Param("example") InstructorExample example);
}