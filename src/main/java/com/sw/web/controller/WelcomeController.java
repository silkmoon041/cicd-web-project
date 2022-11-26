package com.sw.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Slf4j
@Controller
public class WelcomeController {

    //private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String index(Model model) {
        log.debug("Welcome to sw.com...");
        //System.out.println("index is called by GET");

        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        System.out.println(model.getAttribute("today"));
        return "index";

    }

    private String getMessage() {
        return "Hi, there";
    }

}