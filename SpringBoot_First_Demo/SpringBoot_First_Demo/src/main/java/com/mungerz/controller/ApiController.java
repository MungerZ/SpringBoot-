package com.mungerz.controller;

import com.mungerz.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// RestController注解：说明该类是一个Controller，并且参数和返回值都要求符合Restful要求（即Json字符串）
@RestController
// RequestMapping注解：Controller的类的映射地址。
@RequestMapping("/api")
public class ApiController {

    // Autowired自动注入注解：相当于new ApiService，不过这个工作是由Spring容器自己完成的。AutoWired可以注入Controller,Service,Component这几种类。
    @Autowired
    private ApiService apiService;

    // RequestMapping注解：方法的映射地址
    @RequestMapping("/info")
    public Map<String, Object> info(Map<String, Object> params){
        return apiService.info(params);
    }

}
