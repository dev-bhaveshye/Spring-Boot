package com.Springboot.firstSpringbootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClass {
    @GetMapping("abc")
    public String hello(){
        return "hello";
    }
}
