package com.ldi.mapper;

import com.ldi.POJO.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
//    根据学号查找用户
    User queryUserByStuNumber(String stuNumber);
}
