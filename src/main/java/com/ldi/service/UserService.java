package com.ldi.service;

import com.ldi.POJO.User;

public interface UserService {
    //    根据学号和密码查找用户
    User queryUserByStuNumberAndPsw(String stuNumber, String psw);
    //    根据学号条件更新密码
    User updatePswByStuNumber(String newPsw, String stuNumber);
}
