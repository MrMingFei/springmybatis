package com.study.springmybatis.manager;

import com.study.springmybatis.dao.SpittleDao;
import com.study.springmybatis.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpittleManager {

    @Autowired
    private SpittleDao spittleDao;

    public List<Spittle> findRecentSpittles(){
        return spittleDao.findRecentSpittles();
    }

    public List<Spittle> findSpittles(long max, int count){
        return spittleDao.findSpittles(max, count);
    }

    public Spittle findByID(long ID){
        return spittleDao.findByID(ID);
    }

    public void save(Spittle spittle){
        spittleDao.save(spittle);
    }
}
