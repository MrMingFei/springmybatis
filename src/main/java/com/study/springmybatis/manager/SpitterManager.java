package com.study.springmybatis.manager;

import com.study.springmybatis.dao.SpitterDao;
import com.study.springmybatis.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpitterManager {

    @Autowired
    private SpitterDao spitterDao;

    public void insert(Spitter spitter){

        spitterDao.insert(spitter);
    }

    public Spitter findByUsername(String username){
        Spitter spitter = spitterDao.findByUsername(username);
        return spitter;
    }
}
