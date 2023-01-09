package com.example.SpringBootDemoProject.service;

import com.example.SpringBootDemoProject.dto.Dto;
import java.util.List;
public interface DemoService{

    public List<Dto> getAllDto();
    public String getDtoNameById(int id);
}
