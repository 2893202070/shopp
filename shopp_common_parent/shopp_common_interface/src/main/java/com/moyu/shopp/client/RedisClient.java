package com.moyu.shopp.client;

import com.moyu.shopp.factory.RedisServiceFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "common-provider",fallbackFactory = RedisServiceFactory.class)
@RequestMapping("/common")
public interface RedisClient {

    @RequestMapping(value = "/redis",method = RequestMethod.POST)
    void set(@RequestParam("key") String key, @RequestParam("value") String value) ;

    @RequestMapping(value = "/redis/{key}",method = RequestMethod.GET)
    String get(@PathVariable("key")String key);
}

