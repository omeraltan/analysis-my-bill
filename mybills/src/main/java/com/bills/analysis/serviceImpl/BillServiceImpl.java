package com.bills.analysis.serviceImpl;

import com.bills.analysis.entity.Bills;
import com.bills.analysis.repository.BillsRepository;
import com.bills.analysis.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    BillsRepository repository;

    @Override
    public List<Bills> findAll() {
        return repository.findAll();
    }
}
