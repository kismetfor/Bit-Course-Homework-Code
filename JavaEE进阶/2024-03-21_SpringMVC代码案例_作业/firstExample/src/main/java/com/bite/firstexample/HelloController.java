package com.bite.firstexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "<h1>hello</h1>";
    }
}
