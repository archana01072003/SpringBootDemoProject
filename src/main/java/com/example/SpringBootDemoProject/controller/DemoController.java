package com.example.SpringBootDemoProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test") // URL for this endpoint will be : http://localhost:8080/demo/test
    public String test() {
        return "Sample String for /demo/test endpoint";
    }
}
