package com.example.jenkinscruddemo.controller;

import com.example.jenkinscruddemo.entity.Mydata;
import com.example.jenkinscruddemo.services.MydataServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyDataController {

    private final MydataServices mydataServices;

    public MyDataController(MydataServices mydataServices) {
        this.mydataServices = mydataServices;
    }

    @PostMapping("/save")
    public Mydata save(Mydata mydata){
        return mydataServices.save(mydata);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        mydataServices.deleteById(id);
      return "it has been deleted";
    }
}
