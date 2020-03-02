package com.test.lxl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: test读取properties信息
 * @author: Lixinling
 * @create: 2020-02-25 17:43
 **/
@RestController
public class ConfigController {

    @Value("${boot.name}")
    private String name;
    @Value("${boot.age}")
    private int age;

    @GetMapping("/config")
    public String config(){
        String s = "测试："+name + ":" + age;
        System.out.println(s);
        return s;
    }

}
