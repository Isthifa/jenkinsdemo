package com.example.jenkinscruddemo.services.impl;

import com.example.jenkinscruddemo.entity.Mydata;
import com.example.jenkinscruddemo.repository.MyDataRepository;
import com.example.jenkinscruddemo.services.MydataServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MydataServiceImpl implements MydataServices {

    @Autowired
    private final MyDataRepository myDataRepository;
    @Override
    public Mydata save(Mydata mydata) {
        return myDataRepository.save(mydata);
    }

    @Override
    public void deleteById(int id) {
         myDataRepository.deleteById(id);
    }
}
