package com.test.lxl.config;

import com.test.lxl.config.db.DBConfig;
import com.test.lxl.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description:
 * @author: Lixinling
 * @create: 2020-02-27 10:19
 **/
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/**").excludePathPatterns("/config");
    }
}
