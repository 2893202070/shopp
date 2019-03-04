package com.moyu.shopp.client;


import com.moyu.shopp.factory.StaticPageServiceFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@FeignClient(value = "common-provider", fallbackFactory = StaticPageServiceFactory.class)
@RequestMapping("/common")
public interface StaticPageClient {

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public void staticPage(@RequestBody Map<String,Object> map);
}
