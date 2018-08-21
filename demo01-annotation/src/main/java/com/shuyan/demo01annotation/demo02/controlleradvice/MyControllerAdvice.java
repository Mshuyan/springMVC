package com.shuyan.demo01annotation.demo02.controlleradvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author will
 * 说明：@ControllerAdvice + @ResponseBody可以替换为 @RestControllerAdvice
 * 功能：用于测试 @ControllerAdvice + @ExceptionHandler 注解
 */
//@ControllerAdvice
//@ResponseBody
public class MyControllerAdvice {
    @ExceptionHandler({Exception.class})
    public Map<String,String> exceptionHandler(final Exception ex, final WebRequest req){
        Map<String,String> map = new HashMap<>();
        map.put("status","500");
        map.put("message", ex.getMessage());
        return map;
    }
}
