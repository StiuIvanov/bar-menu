package com.example.demo.model.entity;

import com.example.demo.model.entity.enums.TypeEnum;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity extends BaseEntity {
    private String name;
    private Double price;
    private TypeEnum type;

    public ProductEntity() {
    }

    @Column
    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    @Column
    public Double getPrice() {
        return price;
    }

    public ProductEntity setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public TypeEnum getType() {
        return type;
    }

    public ProductEntity setType(TypeEnum type) {
        this.type = type;
        return this;
    }
}
