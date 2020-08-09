package com.project.but.but.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Products {
    @Id
    private String productName;
    private int price;
    private int receiptId;
}
