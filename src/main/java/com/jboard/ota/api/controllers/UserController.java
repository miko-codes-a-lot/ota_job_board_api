package com.jboard.ota.api.controllers;

import com.jboard.ota.api.AppConfig;
import com.jboard.ota.api.models.dto.UserDTO;
import com.jboard.ota.api.repositories.OccupationCategoryRepository;
import com.jboard.ota.api.repositories.OccupationRepository;
import com.jboard.ota.api.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    private final AppConfig appConfig;

    public UserController(UserService userService, AppConfig appConfig, OccupationRepository occupationRepository, OccupationCategoryRepository occupationCategoryRepository) {
        this.userService = userService;
        this.appConfig = appConfig;
    }

    @GetMapping("/")
    public List<UserDTO> findAll() {
        return userService.findAllByRealmId(appConfig.realmId());
    }

    @GetMapping("/my-session")
    public Authentication authentication(Authentication authentication) {
        return authentication;
    }
}
