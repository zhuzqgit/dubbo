package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhuzhiqiang
 * @date 2019/6/14 12:17
 * @email zhu_zq@aliyun.com
 */
@Repository
public interface UserMapper {
    User findByUserName(String userName);

    List<User> findAll();

    void insert(User user);

    void update(User entity);

    void delete(Long id);
}
