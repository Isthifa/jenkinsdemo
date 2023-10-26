package com.example.jenkinscruddemo.repository;

import com.example.jenkinscruddemo.entity.Mydata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDataRepository extends JpaRepository<Mydata,Integer> {
}
