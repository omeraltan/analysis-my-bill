package com.bills.analysis.serviceImpl;

import com.bills.analysis.entity.Institution;
import com.bills.analysis.repository.InstitutionRepository;
import com.bills.analysis.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    InstitutionRepository repository;
    @Autowired
    public InstitutionServiceImpl(InstitutionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Institution> getAllInstitution() {
        return repository.findAll();
    }

    @Override
    public void saveInstitution(Institution institution) {
        if (institution.getId() == null){
            repository.save(institution);
        } else {

        }
    }
}
