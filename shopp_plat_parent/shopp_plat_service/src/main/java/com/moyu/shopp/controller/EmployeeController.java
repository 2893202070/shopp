package com.moyu.shopp.controller;

import com.moyu.shopp.domain.Employee;
import com.moyu.shopp.utils.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    //只有post请求才能访问
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //@RequestBody 让前台给这个对象自动赋值
    public AjaxResult login(@RequestBody Employee employee){
        if (employee.getName().equals("admin")&&employee.getPassword().equals("admin")){
            return new AjaxResult();
        }
            return new AjaxResult().setSuccess(false).setMsg("登陆失败");
    }
}
