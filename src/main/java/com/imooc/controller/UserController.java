package com.imooc.controller;


import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController //@RequestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setAge(27);
        user.setName("Tom");
        user.setPassword("12345");
        user.setBirthday(new Date());
        user.setDesc(null);
        return user;
    }
}
