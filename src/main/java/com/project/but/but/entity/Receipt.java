package com.project.but.but.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Receipt {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = true)
    private String shopName;
    @Column(nullable = true)
    private String wifiId;
    @Column(nullable = true)
    private String wifiPw;
    @Column(nullable = false)
    private int userId;
    @Column(nullable = true)
    private int barcode;
    @Column(nullable = true)
    private String storePhoneNumber;
    @Column(nullable = true)
    private String card;
    @Column(nullable = true)
    private int orderNum;

    @Column(nullable = false)
    private Date createDate;
}
