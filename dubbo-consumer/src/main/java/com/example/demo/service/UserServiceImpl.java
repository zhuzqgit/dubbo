package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhuzhiqiang
 * @date 2019/6/14 11:56
 * @email zhu_zq@aliyun.com
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

    @Override
    public List<User> getAll() {
        return userMapper.findAll();
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void modify(User entity) {
        userMapper.update(entity);
    }

    @Override
    public void remove(Long id) {
        userMapper.delete(id);
    }
}
