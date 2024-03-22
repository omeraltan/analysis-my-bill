package com.bills.analysis.controller;

import com.bills.analysis.entity.Bills;
import com.bills.analysis.service.BillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Swagger documentation link: http://localhost:8181/swagger-ui.html#/
 * Swagger editor link       : https://editor.swagger.io/
 * Api docs                  : http://localhost:8181/v2/api-docs
 */

@RestController
@RequestMapping("/bills")
@Api(value = "Home Api documentation")
public class HomeController {

    @Autowired
    BillService service;

    @GetMapping("/bill")
    @ApiOperation(value = "Bills Menu Method")
    public String getIndex(Model model){
        model.addAttribute("name",getName());
        return "index";
    }

    @GetMapping("/less")
    @ApiOperation(value = "Bills List Method")
    public ResponseEntity<List<Bills>> getAll(){
        List<Bills> billsList = service.findAll();
        return ResponseEntity.ok(billsList);
    }

    public String getName(){
        return "Ömer ALTAN";
    }

}
