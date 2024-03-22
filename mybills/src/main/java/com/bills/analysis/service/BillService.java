package com.bills.analysis.service;

import com.bills.analysis.entity.Bills;

import java.util.List;

public interface BillService {
    public List<Bills> findAll();
}
