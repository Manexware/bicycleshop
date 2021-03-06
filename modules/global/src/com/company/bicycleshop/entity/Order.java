package com.company.bicycleshop.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@NamePattern("%s|description")
@Table(name = "BICYCLESHOP_ORDER")
@Entity(name = "bicycleshop_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 1735953660157866081L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MECHANIC_ID")
    protected Mechanic mechanic;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "HOURS_SPENT")
    protected Integer hoursSpent;

    @Column(name = "AMOUNT")
    protected BigDecimal amount;

    @JoinTable(name = "WORKSHOP_ORDER_SPARE_PART_LINK",
            joinColumns = @JoinColumn(name = "ORDER_ID"),
            inverseJoinColumns = @JoinColumn(name = "SPARE_PART_ID"))
    @ManyToMany
    protected List<SparePart> parts;

    @Column(name = "STATUS")
    protected Integer status;

    public void setStatus(OrderStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public OrderStatus getStatus() {
        return status == null ? null : OrderStatus.fromId(status);
    }


    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHoursSpent(Integer hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public Integer getHoursSpent() {
        return hoursSpent;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setParts(List<SparePart> parts) {
        this.parts = parts;
    }

    public List<SparePart> getParts() {
        return parts;
    }

}