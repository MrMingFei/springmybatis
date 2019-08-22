package com.study.springmybatis.dao;

import com.study.springmybatis.entity.Spitter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SpitterDao {

    int insert(Spitter spitter);

    Spitter fingByUsername(@Param("username") String username);
}
