package com.ldi.utils;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.alibaba.fastjson.JSON;

public class JSONUtils {
    public static void returnJson(HttpServletResponse res, Object obj){
        res.setCharacterEncoding("UTF-8");
        res.setContentType("application/json;charset=utf-8");
        //禁用缓存，确保网页信息是最新数据
        res.setHeader("Pragma","No-cache");
        res.setHeader("Cache-Control","no-cache");
        res.setDateHeader("Expires",-10);
        PrintWriter writer = null;
        try{
            writer =res.getWriter();
            String s = JSON.toJSONString(obj);
            writer.write(s);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
