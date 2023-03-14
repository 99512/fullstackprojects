package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DishType {

    @Id
    @Column(name = "distype_id")
    private long id;

    private String dishtype;
    private String dishtype_status;
    private Integer type_id;

    public String getDishtype() {
        return dishtype;
    }

    public void setDishtype(String dishtype) {
        this.dishtype = dishtype;
    }

    public String getDishtype_status() {
        return dishtype_status;
    }

    public void setDishtype_status(String dishtype_status) {
        this.dishtype_status = dishtype_status;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }
}
