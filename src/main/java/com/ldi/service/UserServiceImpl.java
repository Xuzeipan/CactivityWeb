package com.ldi.service;

import com.ldi.POJO.User;
import com.ldi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    //    根据学号和密码查找用户
    @Override
    public User queryUserByStuNumberAndPsw(String stuNumber, String psw) {
        User user = userMapper.queryUserByStuNumberAndPsw(stuNumber,psw);
        return user;
    }

    @Override
    public User updatePswByStuNumber(String newPsw, String stuNumber) {
        userMapper.updatePswByStuNumber(newPsw, stuNumber);
        User user = userMapper.queryUserByStuNumberAndPsw(newPsw, stuNumber);
        return user;
    }
}
