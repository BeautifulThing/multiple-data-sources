package com.lin.service;


import com.lin.common.datasource.DataSource;
import com.lin.model.Apple;

import java.util.List;

public interface AppleService {
    @DataSource("db_one")
    List<Apple> getAppleList();
}
