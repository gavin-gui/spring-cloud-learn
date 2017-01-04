package com.gui.mapper;

import com.gui.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gui on 2017/1/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testFindById(){
        User user = userMapper.findById(7L);
        Assert.assertEquals(user.getUsername(),"zhangsan");
    }

    @Test
    public void testQueryUserInfo(){
        User user = userMapper.queryUserInfo("zhangsan");
        Assert.assertEquals(user.getUsername(),"zhangsan");
    }
}