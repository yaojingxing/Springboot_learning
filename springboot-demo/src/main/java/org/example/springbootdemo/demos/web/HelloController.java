package org.example.springbootdemo.demos.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello2")
    public String hello(){
        return "hello spring boot 222";
    }
}
