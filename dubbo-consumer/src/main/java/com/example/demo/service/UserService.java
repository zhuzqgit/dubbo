package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author zhuzhiqiang
 * @date 2019/6/14 11:55
 * @email zhu_zq@aliyun.com
 */
public interface UserService {
    User findByUserName(String userName);

    List<User> getAll();

    void add(User user);

    void modify(User entity);

    void remove(Long id);

}
