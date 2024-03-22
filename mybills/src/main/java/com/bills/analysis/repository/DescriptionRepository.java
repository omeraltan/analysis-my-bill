package com.bills.analysis.repository;

import com.bills.analysis.entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescriptionRepository extends JpaRepository<Description, Long> {
}
