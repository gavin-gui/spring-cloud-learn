package com.gui.contorller;

import com.gui.entity.User;
import com.gui.repository.UserRepository;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gui on 2017/1/7.
 */
@RestController
@Log4j
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id){
        log.info("id:"+id);
        return userRepository.findOne(id);
        // add by gui 2017/1/14 15:59
    }
}
