package com.gui.contorller;

import com.gui.entity.User;
import com.gui.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gui on 2017/1/7.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id){
        return userRepository.findOne(id);
    }
}
