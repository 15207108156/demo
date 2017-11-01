package com.example.controller;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    //    所有数据
    @RequestMapping("/list")
    String list(Model model) {
        List<Map<String, Object>> userlist = userMapper.selectAll();
        model.addAttribute("userlist", userlist);
        return "list";
    }

    //    根据ID删除数据
    @RequestMapping("/user/userDelete")
    String userDelete(@RequestParam("uid") int userId, Model model) {
        userMapper.deleteByPrimaryKey(userId);
        List<Map<String, Object>> userlist = userMapper.selectAll();
        model.addAttribute("userlist", userlist);
        return "list";
    }

    //    根据ID查询数据并返回到页面
    @RequestMapping("/user/userEdit")
    String userEdit(@RequestParam("uid") int userId, Model model) {
        User user = userMapper.selectByPrimaryKey(userId);
        model.addAttribute("user", user);
        return "edit";
    }

    //    根据ID修改数据
    @RequestMapping("/user/userUpdate")
    String userUpdate(@RequestParam("user") User user, Model model) {
        userMapper.updateByPrimaryKeySelective(user);
        List<Map<String, Object>> userlist = userMapper.selectAll();
        model.addAttribute("userlist", userlist);
        return "list";
    }
}
