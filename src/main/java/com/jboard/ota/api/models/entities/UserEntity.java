package com.jboard.ota.api.models.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class UserEntity {
    @Id
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String realmId;

    @Column(columnDefinition="BOOLEAN DEFAULT false")
    private boolean postedJobBefore;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role_mapping",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<KeycloakRole> roles = new HashSet<>();

    @OneToMany(mappedBy = "createdBy")
    private Set<Job> createdJobs;
    @OneToMany(mappedBy = "lastModifiedBy")
    private Set<Job> modifiedJobs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealmId() {
        return realmId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public boolean isPostedJobBefore() {
        return postedJobBefore;
    }

    public void setPostedJobBefore(boolean postedJobBefore) {
        this.postedJobBefore = postedJobBefore;
    }

    public Set<KeycloakRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<KeycloakRole> roles) {
        this.roles = roles;
    }

    public Set<Job> getCreatedJobs() {
        return createdJobs;
    }

    public void setCreatedJobs(Set<Job> createdJobs) {
        this.createdJobs = createdJobs;
    }

    public Set<Job> getModifiedJobs() {
        return modifiedJobs;
    }

    public void setModifiedJobs(Set<Job> modifiedJobs) {
        this.modifiedJobs = modifiedJobs;
    }

    @Override
    public String toString() {
        return STR."UserEntity{id='\{id}',username='\{username}', firstName='\{firstName}', lastName='\{lastName}', email='\{email}', realmId='\{realmId}'}";
    }
}
