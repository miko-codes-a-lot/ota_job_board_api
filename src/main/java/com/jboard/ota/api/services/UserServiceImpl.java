package com.jboard.ota.api.services;

import com.jboard.ota.api.mappers.UserMapper;
import com.jboard.ota.api.models.dto.UserDTO;
import com.jboard.ota.api.repositories.RoleRepository;
import com.jboard.ota.api.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final RoleRepository roleRepository;

    public UserServiceImpl(final UserRepository userRepository, final UserMapper userMapper, final RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.userMapper = userMapper;
    }



    @Override
    public List<UserDTO> findAllByRealmId(String realmId) {
        userRepository.findByRolesName("MODERATOR")
                .forEach(System.out::println);
        return userRepository.findAllByRealmId(realmId)
                .stream()
                .map(userMapper::toDTO)
                .toList();
    }
}
