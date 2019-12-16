package com.company.adminaddon.entity;

import com.haulmont.addon.sdbmt.entity.StandardTenantEntity;
import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|firstName,lastName")
@Table(name = "ADMINADDON_EMPLOYEE")
@Entity(name = "adminaddon_Employee")
public class Employee extends StandardTenantEntity {
    private static final long serialVersionUID = -1601994240317535652L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    @Column(name = "COMPANY_ADMIN_VIEW_ONLY")
    protected Boolean adminViewOnly;

    public Boolean getAdminViewOnly() {
        return adminViewOnly;
    }

    public void setAdminViewOnly(Boolean adminViewOnly) {
        this.adminViewOnly = adminViewOnly;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}