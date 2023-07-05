package com.jiamo.seckill.entity;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//用户
public class User {
    private int id;
    private String userName;
    private String phone;
    private String password;
    private String salt;
    private String head;
    private int loginCount;
    private Date registerDate;
    private Date lastLoginDate;
}