package com.ldi.service;

import com.ldi.POJO.User;

public interface UserService {
    //    根据学号查找用户
    User queryUserByStuNumber(String stuNumber);
}
