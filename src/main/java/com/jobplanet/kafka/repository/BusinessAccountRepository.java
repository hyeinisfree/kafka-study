package com.jobplanet.kafka.repository;

import com.jobplanet.kafka.entity.BusinessAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessAccountRepository extends JpaRepository<BusinessAccount, Long> {

}
