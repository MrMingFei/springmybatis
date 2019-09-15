package com.study.springmybatis.manager;

import com.study.springmybatis.dao.SpittleDao;
import com.study.springmybatis.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpittleManager {

    @Autowired
    private SpittleDao spittleDao;

    public Spittle findByID(long ID){
        return spittleDao.findByID(ID);
    }

    public void save(Spittle spittle){
        spittleDao.save(spittle);
    }
}
