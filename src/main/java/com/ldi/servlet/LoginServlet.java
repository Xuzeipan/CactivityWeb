package com.ldi.servlet;

import com.ldi.POJO.User;
import com.ldi.dto.Result;
import com.ldi.service.UserService;
import com.ldi.utils.JSONUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        String stuNumber = request.getParameter("stuNumber");
        String password = request.getParameter("password");
        UserService userService = context.getBean(UserService.class);
        User user = userService.queryUserByStuNumberAndPsw(stuNumber, password);
        if (user == null){
            Result result = new Result(1, "失败", null);
            JSONUtils.returnJson(response,result);
        }else{
            Result result = new Result(0, "成功", user);
            request.getSession().setAttribute("User",user);
            JSONUtils.returnJson(response,result);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
