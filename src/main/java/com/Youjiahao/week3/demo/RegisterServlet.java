package com.Youjiahao.week3.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        String email= request.getParameter("email");
        String gender= request.getParameter("gender");
        String birthDate= request.getParameter("birthDate");
        PrintWriter writer =response.getWriter();
        writer.println("<br>username:"+username);
        writer.println("<br>password:"+password);
        writer.println("<br>email:"+email); writer.println("<br>gender:"+gender);
        writer.println("<br>birthDate:"+birthDate);
        writer.close();

    }
}
