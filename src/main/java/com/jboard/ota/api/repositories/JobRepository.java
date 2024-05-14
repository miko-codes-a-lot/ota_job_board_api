package com.jboard.ota.api.repositories;

import com.jboard.ota.api.models.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<Job, UUID> {
}
