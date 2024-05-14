package com.jboard.ota.api.repositories;

import com.jboard.ota.api.models.entities.JobDescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobDescriptionRepository extends JpaRepository<JobDescription, UUID> {
}
