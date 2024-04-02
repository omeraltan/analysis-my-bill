package com.bills.analysis.controller;

import com.bills.analysis.entity.Institution;
import com.bills.analysis.service.InstitutionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/kurum")
public class InstitutionController {

    InstitutionService service;

    @Autowired
    public InstitutionController(InstitutionService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Kurum Ana Sayfa Verileri")
    public String getKurum(Model model){
        Institution institution = new Institution();
        model.addAttribute("institution",institution);
        List<Institution> list = service.getAllInstitution();
        model.addAttribute("list",list);
        return "kurum";
    }

    @PostMapping("/processInstitutionForm")
    @ApiOperation(value = "Kurum Menu Method")
    public String processForm(@ModelAttribute("institution") Institution institution){
        service.saveInstitution(institution);
        return "redirect:/kurum";
    }

}

