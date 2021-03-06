package com.study.springmybatis.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/")
public class HomeController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(method = GET)
    public String index(Model model){

        return "home";
    }
}
