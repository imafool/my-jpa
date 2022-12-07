package com.coco.jpademo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users") //表名
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键策略
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    /**
     * 添加外键关联
     */
    @JoinColumn(name = "detail_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) //关联关系，ALL：所有操作设置关联
    private UsersDetail usersDetail;
}
