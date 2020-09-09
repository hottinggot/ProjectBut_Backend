package com.project.but.but.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int user_num;
    private String user_id;
    private String password;
    private String email;
    private String phone;
}
