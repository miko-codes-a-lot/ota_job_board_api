package com.jboard.ota.api.models.entities;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class EmploymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String code;
    private String name;

    @OneToMany(mappedBy = "employmentType")
    private Set<Job> jobs;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return STR."EmploymentType{id='\{id.toString()}', code='\{code}', name='\{name}'}";
    }
}
