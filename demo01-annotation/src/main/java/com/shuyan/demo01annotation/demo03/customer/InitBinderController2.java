package com.shuyan.demo01annotation.demo03.customer;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author will
 * 功能：用于测试 @InitBinder
 */
@RestController
@RequestMapping("/init-binder")
public class InitBinderController2 {
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        // 注册自定义的转换器
        binder.registerCustomEditor(Date.class, new MyCustomerEditor());
    }

    @GetMapping("/test1")
    public void test(Date birthday){
        System.out.println(birthday);
    }
}
