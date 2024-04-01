package com.bills.analysis.controller;

import com.bills.analysis.entity.Bills;
import com.bills.analysis.service.BillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
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
    @ApiOperation(value = "Bills Menu Method")
    public String getIndex(Model model){
        return "index";
    }

    @GetMapping("/tanim")
    @ApiOperation(value = "Tanım Menu Method")
    public String getTanim(Model model){
        return "tanim";
    }

    @GetMapping("/fatura")
    @ApiOperation(value = "Fatura Menu Method")
    public String getFatura(Model model){
        return "fatura";
    }

    @GetMapping("/kurum")
    @ApiOperation(value = "Kurum Menu Method")
    public String getKurum(Model model){
        return "kurum";
    }

    @GetMapping("/less")
    @ApiOperation(value = "Bills List Method")
    public ResponseEntity<List<Bills>> getAll(){
        List<Bills> billsList = service.findAll();
        return ResponseEntity.ok(billsList);
    }

}
