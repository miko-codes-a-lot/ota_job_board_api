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
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Long externalId;
    private String company;
    private String office;
    private String name;

    private String yearsOfExperience;
    private String keywords;

    @ManyToMany
    private Set<JobDescription> descriptions;

    @ManyToOne
    @JoinColumn(name = "employment_type_id")
    private EmploymentType employmentType;

    @ManyToOne
    @JoinColumn(name = "seniority_id")
    private Seniority seniority;

    @ManyToOne
    @JoinColumn(name = "occupation_id")
    private Occupation occupation;

    @ManyToOne
    @JoinColumn(name = "occupation_category_id")
    private OccupationCategory occupationCategory;

    @ManyToOne
    @JoinColumn(name = "job_created_by")
    private UserEntity createdBy;

    @ManyToOne
    @JoinColumn(name = "job_last_modified_by")
    private UserEntity lastModifiedBy;

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

    public Long getExternalId() {
        return externalId;
    }

    public void setExternalId(Long externalId) {
        this.externalId = externalId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Set<JobDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Set<JobDescription> descriptions) {
        this.descriptions = descriptions;
    }

    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(EmploymentType employmentType) {
        this.employmentType = employmentType;
    }

    public Seniority getSeniority() {
        return seniority;
    }

    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public OccupationCategory getOccupationCategory() {
        return occupationCategory;
    }

    public void setOccupationCategory(OccupationCategory occupationCategory) {
        this.occupationCategory = occupationCategory;
    }

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public UserEntity getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(UserEntity lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
        return STR."Job{id='\{id.toString()}', externalId='\{externalId}', company='\{company}', office='\{office}', name='\{name}', yearsOfExperience='\{yearsOfExperience}', keywords='\{keywords}', dateCreated='\{dateCreated}', dateUpdated='\{dateUpdated}'}";
    }
}
