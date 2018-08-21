package com.shuyan.demo01annotation.demo06;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author will
 */
@RestController
@RequestMapping("path-variable")
@CrossOrigin()
public class PathVariableController {

    @RequestMapping("/test/{id}")
    public String test(@PathVariable String id){
        return id;
    }
}
