package com.test.lxl.annotation;

import com.test.lxl.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;

/**
 * @description: 测试自定义注解
 * @author: Lixinling
 * @create: 2020-03-01 15:31
 **/
//@SpringBootTest
public class TestAnnotation {

    @Test
    public void test1() {
        Class<User> userClass = User.class;
        MyAnnotation annotation = userClass.getAnnotation(MyAnnotation.class);
        if(annotation != null){
            System.out.println(annotation.value() + ": age="+annotation.age());
        }
    }

    @Test
    public void test2() throws IllegalAccessException {
        User user = new User();
        Class<User> userClass = User.class;
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            MyAnnotation annotation = declaredField.getAnnotation(MyAnnotation.class);
            if (annotation != null) {
                declaredField.setAccessible(true);
                declaredField.set(user,annotation.value());
            }
        }
        System.out.println(user);



    }

}
