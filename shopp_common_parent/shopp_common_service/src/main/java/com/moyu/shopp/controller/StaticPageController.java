package com.moyu.shopp.controller;

import com.moyu.shopp.client.StaticPageClient;
import com.moyu.shopp.constants.GlobelConstants;
import com.moyu.shopp.utils.VelocityUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/common")
public class StaticPageController implements StaticPageClient {


    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @Override
    public void staticPage(@RequestBody Map<String , Object> map) {
        //model:模板数据  templateFilePathAndName：模板路径 targetFilePathAndName：输出html文件路径
        Object model = map.get(GlobelConstants.PAGE_MODE);

        String templateFilePathAndName = (String) map.get(GlobelConstants.PAGE_TEMPLATE);

        String targetFilePathAndName = (String)map.get(GlobelConstants.PAGE_TEMPLATE_HTML);

        System.out.println("model==="+model);
        System.out.println("templateFilePathAndName==="+templateFilePathAndName);
        System.out.println("targetFilePathAndName==="+targetFilePathAndName);


        VelocityUtils.staticByTemplate(model, templateFilePathAndName, targetFilePathAndName);


    }
}
