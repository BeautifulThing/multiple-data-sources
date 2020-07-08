package com.lin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.mapper.PersonMapper;
import com.lin.model.Person;
import com.lin.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper,Person> implements PersonService{
}
