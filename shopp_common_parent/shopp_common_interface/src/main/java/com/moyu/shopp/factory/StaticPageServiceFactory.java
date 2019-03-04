package com.moyu.shopp.factory;

import com.moyu.shopp.client.StaticPageClient;
import feign.hystrix.FallbackFactory;

import java.util.Map;

public class StaticPageServiceFactory implements FallbackFactory<StaticPageClient> {
    //托底方法
    @Override
    public StaticPageClient create(Throwable throwable) {
        return new StaticPageClient() {
            @Override
            public void staticPage(Map<String, Object> map) {

            }
        };
    }
}
