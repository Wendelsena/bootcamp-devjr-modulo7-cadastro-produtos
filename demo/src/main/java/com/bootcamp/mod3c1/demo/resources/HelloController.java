package com.bootcamp.mod3c1.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("hello")
    public static String getHello() {
        return "Hello World!!!!!";
    }
}
