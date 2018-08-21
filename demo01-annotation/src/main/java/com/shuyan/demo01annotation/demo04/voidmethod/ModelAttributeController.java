package com.shuyan.demo01annotation.demo04.voidmethod;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author will
 * 说明：用于测试 @ModelAttribute 注解
 */
@RestController
@RequestMapping("/model-attribute")
public class ModelAttributeController {
    /**
     * 该方法可以像 mapping 方法一样获取请求参数
     * model 参数 应该是 主要用于前后端不分离的项目，这里先不研究
     * @param abc
     * @param model
     */
    @ModelAttribute
    public void populateModel(@RequestParam String abc, Model model) {
        model.addAttribute("attributeName", abc);
        System.out.println("set success ; abc=" + abc);
    }

    @GetMapping(value = "/test")
    public String helloWorld() {
        return "test";
    }
}
