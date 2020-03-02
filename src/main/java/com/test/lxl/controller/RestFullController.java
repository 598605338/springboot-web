package com.test.lxl.controller;

import com.test.lxl.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: RestFull测试
 * @author: Lixinling
 * @create: 2020-02-26 10:50
 **/
@RestController
public class RestFullController {

    @GetMapping("/user/get/{id}/{name}")
    public User getUser(@PathVariable("id") int id, @PathVariable("name") String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        System.out.println("user1 = " + user);
        return user;
    }

    @GetMapping("/user/{id}/get/{name}")
    public User getUser2(@PathVariable("id") int id, @PathVariable("name") String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        System.out.println("user2ss = " + user);
        return user;
    }
}
