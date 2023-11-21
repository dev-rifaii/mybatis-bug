package dev.rifaii.mybatisbug;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Select("SELECT * FROM test WHERE id = #{id}")
    TestDto findById(@Param("id") Long id);
}
