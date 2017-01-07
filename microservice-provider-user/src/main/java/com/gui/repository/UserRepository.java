package com.gui.repository;

import com.gui.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gui on 2017/1/7.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
