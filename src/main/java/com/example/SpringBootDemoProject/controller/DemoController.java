package com.example.SpringBootDemoProject.controller;

import com.example.SpringBootDemoProject.dto.Dto;
import com.example.SpringBootDemoProject.service.DemoService;
import com.example.SpringBootDemoProject.service.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

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


    //------------DeleteMapping-------------------------
    @DeleteMapping

    //input using request body
    @PostMapping(value="/requestbody") // URL for this endpoint will be: localhost:8080/demo/requestbody
    public String inputWithRequestBody(@RequestBody Dto dto){
        System.out.println(dto);
        return "Data stored successfully";

    }


}
