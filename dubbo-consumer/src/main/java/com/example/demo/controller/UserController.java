package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.example.api.service.RemoteUserService;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhuzhiqiang
 * @date 2019/6/14 10:44
 * @email zhu_zq@aliyun.com
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Reference
    private RemoteUserService remoteUserService;


    @GetMapping("/{userName}/query")
    @ResponseBody
    public String getById(@PathVariable("userName") String userName){
        System.out.println("userName:"+userName);
        User user = userService.findByUserName(userName);
        return JSONObject.toJSONString(user);
    }

    @GetMapping("/all/query")
    @ResponseBody
    public List<User> getAll(){
        List<User> result = userService.getAll();
        return result;
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(@RequestBody User user){
        userService.add(user);
        return "success";
    }

    @PutMapping("/update")
    @ResponseBody
    public String modify(@RequestBody User entity){
        userService.modify(entity);
        return "success";
    }

    @DeleteMapping("/{id}/delete")
    @ResponseBody
    public String delete(@PathVariable("id") Long id){
        userService.remove(id);
        return "success";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){

        String message = remoteUserService.getMessage();
        return message;
    }
}
