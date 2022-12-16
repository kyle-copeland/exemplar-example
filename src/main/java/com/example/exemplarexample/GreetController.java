package com.example.exemplarexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/hello")
    public String getMessage() {
        return "Hello World";
    }
}
