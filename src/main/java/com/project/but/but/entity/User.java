package com.project.but.but.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private int userNum;
    private String userId;
    private String password;
    private String email;
    private String phone;
}
