package com.lin.service.impl;

import com.lin.mapper.AppleMapper;
import com.lin.model.Apple;
import com.lin.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppleServiceImpl implements AppleService {
    @Autowired
    private AppleMapper appleMapper;
    @Override
    public List<Apple> getAppleList() {
        List<Apple> list = null;
        try {
            list = appleMapper.selectList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
