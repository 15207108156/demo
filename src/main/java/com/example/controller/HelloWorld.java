package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorld {
    private final UserServiceImpl userServiceImpl;

    @Autowired
    public HelloWorld(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @RequestMapping("/")
    String home() {
        return "index";
    }

    @RequestMapping("/reg")
    @ResponseBody
    Boolean reg(@RequestParam("userId") String userId ){
        User user=userServiceImpl.regUser(userId);
        System.out.println(user);
        return true;
    }
}
