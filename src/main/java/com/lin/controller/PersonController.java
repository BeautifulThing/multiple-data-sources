package com.lin.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.model.Person;
import com.lin.service.PersonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping("/list")
    @ApiOperation(value = "获取全部人物信息")
    public List<Person> list(){
        return personService.list(new QueryWrapper<Person>().lambda());
    }
}
