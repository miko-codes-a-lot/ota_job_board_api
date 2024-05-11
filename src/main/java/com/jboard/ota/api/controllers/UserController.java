package com.jboard.ota.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/")
    public List<String> getAll() {
        return List.of("Miko Chu", "Darwin Chu", "Arvin Chu", "Aron Garcia");
    }
}
