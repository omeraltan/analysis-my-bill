package com.bills.analysis.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BillController {

    @GetMapping("/fatura")
    @ApiOperation(value = "Fatura Menu Method")
    public String getFatura(Model model){
        return "fatura";
    }

}
