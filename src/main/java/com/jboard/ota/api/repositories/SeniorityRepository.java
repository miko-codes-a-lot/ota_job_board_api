package com.jboard.ota.api.repositories;

import com.jboard.ota.api.models.entities.Seniority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SeniorityRepository extends JpaRepository<Seniority, UUID> {
}
