package com.chixing.controller;


import com.chixing.util.GetMessageCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "sendSMSServlet",urlPatterns = "/sendSMS")
public class sendSMSServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String phone=request.getParameter("phone");
        String code =/* GetMessageCode.getCode(phone)*/ "123456";  //根据获取到的手机号发送验证码

        System.out.println("生成的验证码为：  "+code);
        response.getWriter().print(code);//将数据返回到前端

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
