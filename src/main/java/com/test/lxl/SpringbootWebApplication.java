package com.test.lxl;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

// SpringBootApplication 注解开启自动扫描配置（默认只能扫描同级包或子包）
@SpringBootApplication
@ServletComponentScan(basePackages = {"com.test.lxl.filter"})
@Component
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootWebApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
