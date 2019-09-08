package com.qin.guli.user.service.impl;

import com.qin.guli.user.bean.Umsmember;
import com.qin.guli.user.mapper.UserMapper;
import com.qin.guli.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title:com.qin.guli.user.service.impl
 * @Description:
 * @Author:18883
 * @Date:2019/9/722:44
 * @Version:1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<Umsmember> getAllUser() {
        List<Umsmember> umsmemberList = userMapper.selectAllUser();
        return null;
    }
}
