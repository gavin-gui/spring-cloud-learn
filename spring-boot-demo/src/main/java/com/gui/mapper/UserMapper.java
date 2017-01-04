package com.gui.mapper;

import com.gui.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by gui on 2017/1/4.
 */
@Mapper
public interface UserMapper {

    @Select("Select * from tb_user where id=#{id}")
    User findById(@Param("id") Long id);

    User queryUserInfo(@Param("username") String username);

    User queryUser(@Param("username") String username,@Param("password") String password);
}
