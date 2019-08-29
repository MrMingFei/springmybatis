package com.study.springmybatis.dao;

import com.study.springmybatis.entity.Spitter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface SpitterDao {

    int insert(Spitter spitter);

    Spitter findByUsername(@Param("username") String username);
}
