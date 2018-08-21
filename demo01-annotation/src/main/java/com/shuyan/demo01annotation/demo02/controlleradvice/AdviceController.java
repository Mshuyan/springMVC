package com.shuyan.demo01annotation.demo02.controlleradvice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author will
 * 功能：用于测试 @ControllerAdvice + @ExceptionHandler 注解
 */
@RestController
@RequestMapping("/exception_handler")
public class AdviceController {
    @GetMapping("/advice")
    public Integer test(){
        return 100/0;
    }
}
