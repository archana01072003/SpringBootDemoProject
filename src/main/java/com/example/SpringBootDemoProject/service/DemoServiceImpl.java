package com.example.SpringBootDemoProject.service;


import com.example.SpringBootDemoProject.dto.Dto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DemoServiceImpl implements  DemoService{


    @Override
    public List<Dto> getAllDto() {
        List<Dto> list;
        list = new ArrayList<>();
        list.add(new Dto(1,"ram"));
        list.add(new Dto(2,"shyam"));
        return list;
    }

    @Override
    public String getDtoNameById(int id) {
        return null;
    }
    public  String verifyDto(){
        return null;
    }
}
