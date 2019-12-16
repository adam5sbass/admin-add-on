package com.company.adminaddon.entity;

import com.haulmont.addon.sdbmt.entity.StandardTenantEntity;
import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s|projectName")
@Table(name = "ADMINADDON_PROJECT")
@Entity(name = "adminaddon_Project")
public class Project extends StandardTenantEntity {
    private static final long serialVersionUID = 4292317399356116113L;

    @NotNull
    @Column(name = "PROJECT_NAME", nullable = false)
    protected String projectName;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "PROJECT_START_DATE", nullable = false)
    protected Date projectStartDate;

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}