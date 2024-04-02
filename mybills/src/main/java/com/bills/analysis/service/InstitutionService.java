package com.bills.analysis.service;

import com.bills.analysis.entity.Institution;

import java.util.List;

public interface InstitutionService {

    public List<Institution> getAllInstitution();
    public void saveInstitution(Institution institution);


}
