package com.jobplanet.kafka.repository;

import com.jobplanet.kafka.entity.CompanyStory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyStoryRepository extends JpaRepository<CompanyStory, Long> {

}
