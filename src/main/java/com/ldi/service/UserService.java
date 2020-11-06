package com.ldi.service;

import com.ldi.POJO.User;

public interface UserService {
    //    根据学号和密码查找用户
    User queryUserByStuNumberAndPsw(String stuNumber, String psw);
}
