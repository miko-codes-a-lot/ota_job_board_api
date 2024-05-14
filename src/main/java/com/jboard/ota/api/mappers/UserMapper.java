package com.jboard.ota.api.mappers;

import com.jboard.ota.api.models.dto.UserDTO;
import com.jboard.ota.api.models.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserMapper implements Mapper<UserEntity, UserDTO> {
    @Override
    public UserDTO toDTO(UserEntity user) {
        return UserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .postedJobBefore(user.isPostedJobBefore())
                .realmId(user.getRealmId())
                .build();
    }

    @Override
    public UserEntity toEntity(UserDTO dto) {
        return UserEntity.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .postedJobBefore(dto.isPostedJobBefore())
                .realmId(dto.getRealmId())
                .build();
    }
}
