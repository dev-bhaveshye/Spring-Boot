package com.Springboot.firstSpringbootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClass {
    @Autowired
    Dog dog;
    @GetMapping("abc")
    public String hello(){
        return dog.animal();
    }
}
