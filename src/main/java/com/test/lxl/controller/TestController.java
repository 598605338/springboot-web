package com.test.lxl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Lixinling
 * @create: 2020-02-25 15:52
 **/
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(String str) {
        System.out.println(str);
        return str;
    }

}
