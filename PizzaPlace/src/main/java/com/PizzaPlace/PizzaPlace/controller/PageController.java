package com.PizzaPlace.PizzaPlace.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin
@RequestMapping(value = {""})
public class PageController {

    @GetMapping
    public ModelAndView displayPage(ModelAndView modelAndView){
        modelAndView.setViewName("http://localhost:3000");
        return modelAndView;
    }
}
