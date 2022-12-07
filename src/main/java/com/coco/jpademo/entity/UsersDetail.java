package com.coco.jpademo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users_detail")
public class UsersDetail {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "real_name")
    private String realName;
}
