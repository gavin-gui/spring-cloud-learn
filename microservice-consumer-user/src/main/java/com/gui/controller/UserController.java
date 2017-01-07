package com.gui.controller;

import com.gui.controller.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gui on 2017/1/7.
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/user/{id}")
    public User findById(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/user/"+id,User.class);
    }

}
