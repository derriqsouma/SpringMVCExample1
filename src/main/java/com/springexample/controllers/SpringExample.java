package com.springexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by derric on 5/5/15.
 */

@Controller
public class SpringExample {
    
    @RequestMapping("/welcome")
    public String hello(Model model){

        model.addAttribute("message","HELLO WORLD");
        return "hello";
    }

    @RequestMapping("/index")
    public ModelAndView hello1(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg","WELCOME TO SPRING MVC");
        model.setViewName("hello");

        return model;
    }
    
}
