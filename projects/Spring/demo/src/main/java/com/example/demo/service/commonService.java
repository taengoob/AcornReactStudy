package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.commonDAO;

@Service
public class commonService implements commonDAO {

    @Autowired
    commonDAO dao;

    @Override
    public List<String> testDBConnection() {
        return dao.testDBConnection();
    }

    @Override
    public String selectDbTime() {
        return dao.selectDbTime();
    }

}