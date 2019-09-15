package com.study.springmybatis.dao;

import com.study.springmybatis.entity.Spittle;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpittleDao {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findByID(@Param("id") long id);

    int save(Spittle spittle);
}
