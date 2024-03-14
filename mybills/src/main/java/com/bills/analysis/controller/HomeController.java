package com.bills.analysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("name",getName());
        return "index";
    }

    public String getName(){
        return "Ömer ALTAN";
    }

}
