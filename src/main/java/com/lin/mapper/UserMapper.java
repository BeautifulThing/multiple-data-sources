package com.lin.mapper;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.model.User;
import org.apache.ibatis.annotations.Mapper;
@DS(value = "db_one")
@Mapper
public interface UserMapper extends BaseMapper<User>{
}
