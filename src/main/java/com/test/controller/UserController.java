package com.test.controller;

import com.test.dao.GetAdminDao;
import com.test.entity.PmmAdminEntity;
import com.test.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User("张三","123123");
        return user;
    }

    @RequestMapping("/getAdminList")
    @ResponseBody
    public List<PmmAdminEntity> getList(){
        GetAdminDao adminDao = new GetAdminDao();
        return adminDao.getAdminList();
    }
}