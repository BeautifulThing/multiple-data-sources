package com.lin.controller;

import com.lin.model.Apple;
import com.lin.service.AppleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/apple")
public class AppleController {
    @Autowired
    private AppleService appleService;
    @GetMapping("/list")
    @ApiOperation(value = "获取全部Apple信息")
    public List<Apple> list(){
        return appleService.getAppleList();
    }
}
