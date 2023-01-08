package com.coco.jpademo.controller;

import com.coco.jpademo.dao.UsersRepository;
import com.coco.jpademo.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("/users")
public class UserApi {

    @Autowired
    private UsersRepository usersRepository;

    /**
     * 添加用户
     */
    @GetMapping("/add")
    @ResponseBody
    public String addUser(){
        Users user = new Users();
        user.setUsername("Username: " + UUID.randomUUID().toString());
        user.setPassword(UUID.randomUUID().toString());
        user = usersRepository.save(user);
        return user.getId() + "";
    }

}
