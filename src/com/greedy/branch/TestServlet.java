package com.greedy.branch;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("test", "git branch test입니다.");
        request.getRequestDispatcher("/WEB-INF/views/branch/result.jsp")
                .forward(request, response);
        System.out.println("request = " + request);
        //test222222
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
