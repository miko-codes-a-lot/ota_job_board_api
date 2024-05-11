package com.jboard.ota.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/jobs")
public class JobController {
    @GetMapping("/")
    public List<String> findAll() {
        return Arrays.asList("Software Developer", "Quality Assurance", "Product Manager", "CTO");
    }
}
