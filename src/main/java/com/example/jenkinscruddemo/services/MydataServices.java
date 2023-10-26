package com.example.jenkinscruddemo.services;

import com.example.jenkinscruddemo.entity.Mydata;

public interface MydataServices {
    Mydata save(Mydata mydata);

    void deleteById(int id);
}
