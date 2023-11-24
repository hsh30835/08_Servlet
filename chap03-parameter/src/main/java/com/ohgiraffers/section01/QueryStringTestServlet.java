package com.ohgiraffers.section01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class QueryStringTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("이름 : " + name);

        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("나이 : " + age);

        Date birthday = java.sql.Date.valueOf(req.getParameter("birthday"));
        System.out.println("생일 : " + birthday);

        System.out.println("취미[] : ");
        String[] hobbies = req.getParameterValues("hobbies");
        for(String hobby:hobbies){
            System.out.println(hobby + ", ");
        }
    }
}
