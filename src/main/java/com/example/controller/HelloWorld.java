package com.example.controller;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorld {
    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/")
    String home() {
        return "index";
    }

    @RequestMapping("/reg")
    @ResponseBody
    String reg(@RequestParam("userId") int userId ){
        User user=userMapper.regUser(userId);
        System.out.println(user);
        return user.toString();
    }
}
