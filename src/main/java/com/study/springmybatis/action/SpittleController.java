package com.study.springmybatis.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/spittles")
public class SpittleController {

    @RequestMapping(method = GET)
    public void temp(){

    }
}
