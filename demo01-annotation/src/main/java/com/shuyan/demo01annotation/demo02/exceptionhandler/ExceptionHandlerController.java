package com.shuyan.demo01annotation.demo02.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author will
 * 功能：用于测试 @ExceptionHandler 注解
 */
@RestController
@RequestMapping("exception_handler")
public class ExceptionHandlerController {
    @GetMapping("/test")
    public Integer test(){
        return 100/0;
    }
    @ExceptionHandler({Exception.class})
    public Map<String,String> exceptionHandler(final Exception ex, final WebRequest req){
        Map<String,String> map = new HashMap<>();
        map.put("status","500");
        map.put("message", ex.getMessage());
        return map;
    }
}
