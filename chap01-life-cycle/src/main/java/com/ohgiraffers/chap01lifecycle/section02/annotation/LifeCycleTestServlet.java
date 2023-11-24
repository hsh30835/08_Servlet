package com.ohgiraffers.chap01lifecycle.section02.annotation;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
@WebServlet(name = "annotation-servlet", value = "/annotation-lifecycle", loadOnStartup = 1)
// WebServlet은 xml파일을 따로 만들지 않아서 더 좋다
// 웹url은 대문자안씀
// loadOnStartup 은 숫자가 낮을수록 우선순위
public class LifeCycleTestServlet extends HttpServlet {

    private static final long serialVersionUID =1L;

    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;

    public LifeCycleTestServlet(){
        System.out.println("ano static 값 : " + serialVersionUID);
    }
    @Override
    public void init() throws ServletException {
        System.out.println("ano init "+initCount++);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("ano serviceCount "+serviceCount++);
    }

    @Override
    public void destroy() {
        System.out.println("ano destory "+destroyCount++);
    }

}
