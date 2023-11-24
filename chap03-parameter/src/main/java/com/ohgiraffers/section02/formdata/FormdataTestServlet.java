package com.ohgiraffers.section02.formdata;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FormdataTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getCharacterEncoding());

        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        System.out.println("name : " + name);

        Map<String, String[]> requestMap = req.getParameterMap();
        Set<String> keySet = requestMap.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();
            String[] value = requestMap.get(key);
            System.out.println("key : " + key);
            for(String val : value){
                System.out.println(val);
            }
        }

        Enumeration<String> names = req.getParameterNames();
        while (names.hasMoreElements()){
            System.out.println(names.nextElement());
        }
    }
}
