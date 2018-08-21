package com.shuyan.demo01annotation.demo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author will
 * 功能：用于测试 @ResponseStatus 注解
 */
@RestController
@RequestMapping("/response_status")
public class ResponseStatusController {
    @GetMapping("/test")
    public void test(){
        throw new HttpStatusBadGetWayException("响应执行状态码的错误");
    }
}
