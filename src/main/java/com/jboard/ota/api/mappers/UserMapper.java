package com.jboard.ota.api.mappers;

import com.jboard.ota.api.models.dto.UserDTO;
import com.jboard.ota.api.models.entities.UserEntity;
import lombok.val;
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
        val user = new UserEntity();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setPostedJobBefore(dto.isPostedJobBefore());
        user.setRealmId(dto.getRealmId());
        return user;
    }
}
