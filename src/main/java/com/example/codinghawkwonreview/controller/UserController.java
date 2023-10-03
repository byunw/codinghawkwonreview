package com.example.codinghawkwonreview.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.codinghawkwonreview.service.UserService;
import com.example.codinghawkwonreview.domain.User;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value="/userRegister",method = RequestMethod.POST)
    public String register(@RequestParam String userName,@RequestParam String userId,@RequestParam String userEmail,@RequestParam String userPassword){
        User user = new User();
        String encodedUserPassword = passwordEncoder.encode(userPassword);
        user.setName(userName);
        user.setUserId(userId);
        user.setEmail(userEmail);
        user.setPassword(encodedUserPassword);
        userService.register(user);
        return "userRegisterSuccess";
    }

}
