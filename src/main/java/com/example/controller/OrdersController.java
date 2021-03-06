package com.example.controller;

import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class OrdersController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/ordersList")
    String ordersList() {
        return "ordersList";
    }
}
