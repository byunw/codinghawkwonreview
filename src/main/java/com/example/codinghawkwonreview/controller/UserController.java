package com.example.codinghawkwonreview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping(value="/userRegister/",method = RequestMethod.POST)
    public void register(@RequestParam String userName, @RequestParam String userId, @RequestParam String userEmail, @RequestParam String userPassword){

    }

}
