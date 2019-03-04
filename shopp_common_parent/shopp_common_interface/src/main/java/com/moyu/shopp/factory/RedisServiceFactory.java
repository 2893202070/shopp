package com.moyu.shopp.factory;

import com.moyu.shopp.client.RedisClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class RedisServiceFactory implements FallbackFactory<RedisClient> {
    //托底方法
    @Override
    public RedisClient create(Throwable throwable) {
        return new RedisClient() {
            @Override
            public void set(String key, String value) {

            }

            @Override
            public String get(String value) {
                return null;
            }
        };
    }
}
