package com.bills.analysis.controller;

import com.bills.analysis.entity.Institution;
import com.bills.analysis.service.BillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Swagger documentation link: http://localhost:8181/swagger-ui.html#/
 * Swagger editor link       : https://editor.swagger.io/
 * Api docs                  : http://localhost:8181/v2/api-docs
 */

@Controller
@Api(value = "Home Api documentation")
public class HomeController {

    BillService service;

    public HomeController(BillService service) {
        this.service = service;
    }

    @GetMapping("/index")
    @ApiOperation(value = "Home Menu Method")
    public String getIndex(Model model){
        return "index";
    }

}
