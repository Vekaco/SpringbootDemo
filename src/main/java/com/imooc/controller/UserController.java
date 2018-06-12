package com.imooc.controller;


import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RequestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setAge(27);
        user.setName("Tom");
        user.setDesc("Tom is a nice boy");
        return user;
    }
}
