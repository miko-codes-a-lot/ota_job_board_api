package com.jboard.ota.api.repositories;

import com.jboard.ota.api.models.entities.EmploymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmploymentTypeRepository  extends JpaRepository<EmploymentType, UUID> {
}
