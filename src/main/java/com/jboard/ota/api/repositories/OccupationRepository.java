package com.jboard.ota.api.repositories;

import com.jboard.ota.api.models.entities.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OccupationRepository extends JpaRepository<Occupation, UUID> {
}
