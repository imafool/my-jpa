package com.coco.jpademo.controller;

import com.coco.jpademo.dao.UsersRepository;
import com.coco.jpademo.entity.Users;
import com.coco.jpademo.entity.UsersDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserApi {

    @Autowired
    private UsersRepository usersRepository;

    /**
     * 添加用户
     */
    @GetMapping("/add")
    public String addUser(){
        Users user = new Users();
        user.setUsername("Username: " + UUID.randomUUID());
        user.setPassword(UUID.randomUUID().toString());
        user = usersRepository.save(user);
        return user.getId() + "";
    }

    @DeleteMapping("/{id}")
    public String deleteById(Integer id){
        usersRepository.deleteById(id);
        return "已删除！id：" + id;
    }

    @GetMapping("/page")
    public Page<Users> pageList(){
        return usersRepository.findAll(PageRequest.of(1, 6)); //TODO
    }

    @GetMapping("/list")
    public List<Users> usersList(){
        return usersRepository.findAllByUsernameLike("%huwenfei%");
    }

    @GetMapping("/modifyPwd")
    public int modifyPwd(Integer id, String newPwd){
        return usersRepository.updatePasswordById(id, newPwd);
    }

    @GetMapping("/details/{id}")
    public UsersDetail findDetailsById(@PathVariable("id") Integer id){
        return usersRepository.findById(id).get().getUsersDetail();
    }

}
