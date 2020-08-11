package com.company.bicycleshop.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@NamePattern("%s %s|name,phoneNumber")
@Table(name = "BICYCLESHOP_CLIENT")
@Entity(name = "bicycleshop_Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 5499257653860619451L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "PHONE_NUMBER", nullable = false, unique = true, length = 20)
    protected String phoneNumber;

    @Column(name = "EMAIL", nullable = false, unique = true, length = 50)
    protected String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}