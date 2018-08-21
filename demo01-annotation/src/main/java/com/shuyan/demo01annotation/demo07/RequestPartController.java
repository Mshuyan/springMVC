package com.shuyan.demo01annotation.demo07;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author will
 */
@RestController
@RequestMapping("/request-part")
public class RequestPartController {
    @PostMapping("/upload")
    public void uploadFile(@RequestPart MultipartFile file){
        System.out.println(file.getOriginalFilename());
    }
}
