package com.company.bicycleshop.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;


public enum OrderStatus implements EnumClass<Integer> {

    NEW(10),
    IN_PROGRESS(20),
    READY(30);

    private int id;

    OrderStatus(Integer value) {
        this.id = value;
    }

    @NotNull
    public Integer getId() {
        return id;
    }

    @Nullable
    public static OrderStatus fromId(Integer id) {
        for (OrderStatus at : OrderStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
