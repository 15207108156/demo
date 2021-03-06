package com.example.controller;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.TemplateEngine;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class HelloWorld {


    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    String home() {
        return "login";
    }

    @RequestMapping("/index")
    String index() {
        return "index";
    }
    @RequestMapping("/chart")
    String chart() {
        return "chart";
    }

    @RequestMapping("/form-amazeui")
    String formamazeui() {
        return "form-amazeui";
    }

    @RequestMapping("/form-line")
    String formline() {
        return "form-line";
    }

    @RequestMapping("/form-news")
    String formnews() {
        return "form-news";
    }

    @RequestMapping("/form-news-list")
    String formnewslist() {
        return "form-news-list";
    }

    @RequestMapping("/table-font-list")
    String tablefontlist() {
        return "table-font-list";
    }

    @RequestMapping("/table-images-list")
    String tableimageslist() {
        return "table-images-list";
    }


    @RequestMapping("/login")
    String login(HttpServletRequest request, Model model) {
        User user=new User();
        user.setAccount(request.getParameter("account"));
        user.setPassword(request.getParameter("password"));
        User loginUser=userMapper.login(user);
        if (loginUser!=null){
            List<Map<String, Object>> userlist = userMapper.selectAll();
            model.addAttribute("userlist", userlist);
            return "index";
        }else {
            model.addAttribute("message", "登录失败!");
            return "login";
        }
    }
}
