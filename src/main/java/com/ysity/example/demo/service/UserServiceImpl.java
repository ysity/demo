package com.ysity.example.demo.service;

import com.ysity.example.demo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ysity.example.demo.service.UserService;
import com.ysity.example.demo.domain.User;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
