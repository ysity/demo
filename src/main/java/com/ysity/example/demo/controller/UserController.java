package com.ysity.example.demo.controller;
import com.ysity.example.demo.domain.User;
import com.ysity.example.demo.domain.UserRepository;
import com.ysity.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @GetMapping(value = "/user",produces = {"application/json;charset=UTF-8"})
    public List<User> getAllUser(){
        List<User> allUser = userService.getAllUser();
//        for (User user:allUser) {
//            System.out.println(user);
//        }
        return allUser;
    }

    @PostMapping(value = "/adduser")
    public User addUser(Integer userId,
                        String userNickname,String userPassword,String userEmail,Integer actiStates,String actiCode){
        User user = new User();
        user.setUserId(userId);
        user.setUserNickname(userNickname);
        user.setUserPassword(userPassword);
        user.setActiCode(actiCode);
        user.setUserEmail(userEmail);
        user.setActiStates(actiStates);
        user.setTokenExptime(new Date());
        return  userRepository.save(user);
    }
}
