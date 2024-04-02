package com.bills.analysis.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DescriptionController {

    @GetMapping("/tanim")
    @ApiOperation(value = "Tanım Menu Method")
    public String getTanim(Model model){
        return "tanim";
    }

}
