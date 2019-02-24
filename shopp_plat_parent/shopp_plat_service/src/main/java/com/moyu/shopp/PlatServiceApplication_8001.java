package com.moyu.shopp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //声明客户端
public class PlatServiceApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication_8001.class);
    }
}