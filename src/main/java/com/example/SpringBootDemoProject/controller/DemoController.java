package com.example.SpringBootDemoProject.controller;

import com.example.SpringBootDemoProject.dto.Dto;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test") // URL for this endpoint will be : http://localhost:8080/demo/test
    public String test() {
        return "Sample String for /demo/test endpoint";
    }
    //input using path variable
    @GetMapping(value="/pathVariable/{id}")//URL for this endpoint will be : http://localhost:8080/demo/pathVariable/1
    public String inputWithPathVariable(@PathVariable int id)
    {
        return "The value of id is "+ id;
    }
    //input using request param
    @GetMapping(value="/requestParam")//URL for this endpoint will be : http://localhost:8080/demo/requestParam?id=2
    public  String inputWithRequestParam(@RequestParam int id)
    {
        return "The value of id is "+ id;
    }





}
