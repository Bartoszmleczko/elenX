package com.example.elenX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Hello {

    @GetMapping("/")
    public String showHello(Model theModel){

        theModel.addAttribute("hello","Hello World");

        return "hello";
    }

}
