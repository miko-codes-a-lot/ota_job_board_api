package com.jboard.ota.api.models.entities;


import jakarta.persistence.*;
import lombok.val;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import static com.jboard.ota.api.utils.DateUtils.toISOString;

@Entity
public class OccupationCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String code;
    private String name;

    @OneToMany(mappedBy = "occupationCategory")
    private Set<Job> jobs;

    @ManyToOne
    @JoinColumn(name = "occupation_id")
    private Occupation occupation;

    @CreationTimestamp
    private Date dateCreated;

    @UpdateTimestamp
    private Date dateUpdated;

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

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        val dateCreated = toISOString(this.dateCreated);
        val dateUpdated = toISOString(this.dateUpdated);
        return STR."OccupationCategory{id='\{id}', code='\{code}', name='\{name}', dateCreated='\{dateCreated}', dateUpdated='\{dateUpdated}'}";
    }
}
