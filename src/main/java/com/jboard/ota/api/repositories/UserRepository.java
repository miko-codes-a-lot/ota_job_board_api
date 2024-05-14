package com.jboard.ota.api.repositories;

import com.jboard.ota.api.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    List<UserEntity> findAllByRealmId(String realmId);

    List<UserEntity> findByRolesName(String name);
}
