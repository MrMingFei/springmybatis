package com.study.springmybatis.action;

import com.study.springmybatis.entity.Spitter;
import com.study.springmybatis.manager.SpitterManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("spitter")
public class SpitterController {

    @Autowired
    private SpitterManager spitterManager;

    @RequestMapping(value = "/register", method = GET)
    public String showRegistraion(Model model){
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "register", method = POST)
    public String processRegistration(@Valid Spitter spitter, Errors error){
        if (error.hasErrors()){
            return "registerForm";
        }

        spitterManager.insert(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showSpitterProfile(@PathVariable String username, Model model){
        Spitter spitter = spitterManager.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }
}
