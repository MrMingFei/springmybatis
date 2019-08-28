package com.study.springmybatis.manager.impl;

import com.study.springmybatis.dao.SpitterDao;
import com.study.springmybatis.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpitterManager {

    @Autowired
    private SpitterDao spitterDao;

    public void insert(){
        Spitter spitter = new Spitter();
        spitter.setUsername("shifang");
        spitter.setPassword("2718281828");
        spitter.setFirstName("zhang");
        spitter.setLastName("qiaofei");
        spitter.setEmail("18801146258@163.com");

        spitterDao.insert(spitter);
    }

    public void find(){
        Spitter spitter = spitterDao.fingByUsername("shifang");
        System.out.println(spitter.getEmail());
    }
}
