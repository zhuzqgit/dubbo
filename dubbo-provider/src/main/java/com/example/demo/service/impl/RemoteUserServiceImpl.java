package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.service.RemoteUserService;
import org.springframework.stereotype.Component;

/**
 * @author zhuzhiqiang
 * @date 2019/6/14 11:53
 * @email zhu_zq@aliyun.com
 */
@Component
@Service(timeout = 5000)
public class RemoteUserServiceImpl implements RemoteUserService {

    @Override
    public String getMessage() {
        return "dubbo test";
    }
}
