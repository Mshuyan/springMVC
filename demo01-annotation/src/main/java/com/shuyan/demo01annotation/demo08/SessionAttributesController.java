package com.shuyan.demo01annotation.demo08;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * @author will
 */
@RestController
@RequestMapping("/session-attribute")
@SessionAttributes({"name"})
public class SessionAttributesController {

    @ModelAttribute("name")
    public String modelInit(String name){
        System.out.println("model = "+ name);
        return name;
    }

    @RequestMapping("/test")
    public void test(){
    }

    @RequestMapping("/test1")
    public void test(@ModelAttribute("name") String name){
        System.out.println(name);
    }
}
