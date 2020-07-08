package com.lin.mapper;


import com.lin.common.datasource.DataSource;
import com.lin.model.Apple;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface AppleMapper{
    @DataSource("db_one")
    List<Apple> selectList();
}
