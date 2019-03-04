package com.moyu.shopp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.moyu.shopp.mapper")//mapper的路径
//feign的消费者，需要去找接口，从而找到服务
@EnableFeignClients(basePackages = "com.moyu.shopp.client")
public class ProductServiceApplication_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication_8002.class);

    }
}
