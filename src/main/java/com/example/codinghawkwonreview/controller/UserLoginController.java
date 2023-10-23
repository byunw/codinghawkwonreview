package com.example.codinghawkwonreview.controller;

import com.example.codinghawkwonreview.domain.User;
import com.example.codinghawkwonreview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.security.crypto.password.PasswordEncoder;

@Controller
public class UserLoginController {

    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String login(@RequestParam String userId, @RequestParam String userPassword){
        User user = userService.findByUserId(userId);

        boolean loginSuccess = false;
        if(passwordEncoder.matches(userPassword,user.getPassword())){
            return "userLoginSuccess";
        }

        else{
            return "userLoginFail";
        }

    }
    
}