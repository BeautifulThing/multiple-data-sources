package com.lin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.mapper.UserMapper;
import com.lin.model.User;
import com.lin.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
