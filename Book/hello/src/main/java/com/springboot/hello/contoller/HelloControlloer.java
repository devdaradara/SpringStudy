package com.springboot.hello.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlloer {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
