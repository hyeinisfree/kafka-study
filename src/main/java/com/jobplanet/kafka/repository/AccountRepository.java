package com.jobplanet.kafka.repository;

import com.jobplanet.kafka.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
