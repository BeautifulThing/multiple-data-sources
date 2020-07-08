package com.lin.mapper;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.model.Person;
import org.apache.ibatis.annotations.Mapper;
@DS(value = "db_two")
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}
