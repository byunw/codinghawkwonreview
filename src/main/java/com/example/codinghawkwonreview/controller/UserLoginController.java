package com.example.codinghawkwonreview.controller;

import com.example.codinghawkwonreview.domain.User;
import com.example.codinghawkwonreview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserLoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public void login(@RequestParam String userId, @RequestParam String userPassword){
        User user = userService.findByUserIdAndPassword(userId,userPassword);
    }
    
}