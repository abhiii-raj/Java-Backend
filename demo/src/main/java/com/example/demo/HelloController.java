package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // endpoint name and function name may or may not be same
    @GetMapping("/home")
    public String home(){
        return "<h1>Welcome to the page. </h1>";
    }

    @GetMapping("/hello")
    public String greet(){
        return "<h1>Namaste !!</h1>";
    }
}
