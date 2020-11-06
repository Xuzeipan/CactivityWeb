package com.ldi.mapper;

import com.ldi.POJO.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
//    根据学号和密码查找用户
    User queryUserByStuNumberAndPsw(@Param("stuNumber")String stuNumber, @Param("password") String psw);
}
