package com.bills.analysis.repository;

import com.bills.analysis.entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillsRepository extends JpaRepository<Bills, Long> {
}
