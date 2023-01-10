package com.jobplanet.kafka.repository;

import com.jobplanet.kafka.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
