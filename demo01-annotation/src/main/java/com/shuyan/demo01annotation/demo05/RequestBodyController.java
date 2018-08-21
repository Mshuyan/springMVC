package com.shuyan.demo01annotation.demo05;

import org.springframework.web.bind.annotation.*;

/**
 * @author will
 * 说明：用于测试 @RequestBody
 */
@RestController
@RequestMapping("/request-body")
public class RequestBodyController {
    @RequestMapping("/get-test")
    public void getTest(String username){
        System.out.println(username);
    }
}
