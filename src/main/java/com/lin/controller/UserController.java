package com.lin.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.model.User;
import com.lin.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    @ApiOperation(value = "获取全部用户信息")
    public List<User> list(){
        return userService.list(new QueryWrapper<User>().lambda());
    }

    @PostMapping("/save")
    @ApiOperation(value = "保存用户")
    public void save(@RequestBody User user){
        userService.save(user);
    }
}
