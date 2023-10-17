package com.example.codinghawkwonreview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserLoginController {

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public void login(@RequestParam String userId, @RequestParam String userPassword){
    }
    
}