package com.jboard.ota.api.services;

import com.jboard.ota.api.models.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> findAllByRealmId(String realmId);
}
