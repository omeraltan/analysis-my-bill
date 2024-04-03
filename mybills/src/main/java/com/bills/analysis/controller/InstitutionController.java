package com.bills.analysis.controller;

import com.bills.analysis.entity.Institution;
import com.bills.analysis.service.InstitutionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Swagger documentation link: http://localhost:8181/swagger-ui.html#/
 * Swagger editor link       : https://editor.swagger.io/
 * Api docs                  : http://localhost:8181/v2/api-docs
 */

@Controller
@RequestMapping("/kurum")
@Api(value = "Kurum Api documentation")
public class InstitutionController {

    InstitutionService service;

    @Autowired
    public InstitutionController(InstitutionService service) {
        this.service = service;
    }

    @GetMapping
    public String getKurum(Model model){
        Institution institution = new Institution();
        model.addAttribute("institution",institution);
        List<Institution> list = service.getAllInstitution();
        model.addAttribute("list",list);
        return "kurum";
    }

    @PostMapping("/processInstitutionForm")
    @ApiOperation(value = "Kurum Kaydetme İşlemi.")
    public String processForm(@ModelAttribute("institution") Institution institution){
        service.saveInstitution(institution);
        return "redirect:/kurum";
    }

    @GetMapping("/update/{id}")
    @ApiOperation(value = "Kurum Güncelleme İşlemi")
    public String updateKurum(Model model, @PathVariable("id") Long id){
        Institution institution = service.getById(id);
        model.addAttribute("kurum", institution);
        return "kurumedit";
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "Kurum Silme İşlemi.")
    public String deleteKurum(@PathVariable("id") Long id){
        Institution institution = service.getById(id);
        service.delete(institution);
        return "redirect:/kurum";
    }

}

