package com.example.codinghawkwonreview.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.codinghawkwonreview.repository.UserRepository;
import com.example.codinghawkwonreview.domain.User;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void register(User user){
        userRepository.save(user);
    }

    public User findByUserId(String userId){
        User user = userRepository.findByUserId(userId);
        return user;
    }

}
