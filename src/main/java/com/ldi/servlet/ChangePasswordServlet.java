package com.ldi.servlet;

import com.ldi.POJO.User;
import com.ldi.dto.Result;
import com.ldi.service.UserService;
import com.ldi.utils.JSONUtils;
import com.mysql.cj.protocol.NetworkResources;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/changePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        User user = (User) req.getSession().getAttribute("User");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        UserService userService = context.getBean(UserService.class);
        String oldPsw = req.getParameter("oldPassword");
        String newPsw = req.getParameter("newPassword");
        if (user == null){
            JSONUtils.returnJson(resp,new Result(1,"登录超时，请重新登录",null));
        }else{
            String psw = user.getPassword();
            String stuNumber = user.getStuNumber();
            if (psw == oldPsw){
                User dbUser = userService.updatePswByStuNumber(newPsw, stuNumber);
                if (dbUser == null){
                    JSONUtils.returnJson(resp,new Result(1,"修改失败",null));
                }else{
                    JSONUtils.returnJson(resp,new Result(0,"修改密码成功",null));
                }
            }else{
                JSONUtils.returnJson(resp,new Result(1,"输入的原密码不正确",null));
            }
        }
    }
}
