package com.gui.service.impl;

import com.gui.mapper.UserMapper;
import com.gui.model.User;
import com.gui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gui on 2017/1/4.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUser(String username) {
        return userMapper.queryUserInfo(username);
    }
}
