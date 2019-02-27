package com.moyu.shopp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.HashMap;

@SpringBootApplication
@EnableEurekaClient  //声明客户端
@EnableZuulProxy  //启动路由
public class ZuulApplication_9527 {
   public static void main(String[] args) {
      SpringApplication.run(ZuulApplication_9527.class);
   }
}