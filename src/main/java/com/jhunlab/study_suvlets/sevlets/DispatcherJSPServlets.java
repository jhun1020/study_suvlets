package com.jhunlab.study_suvlets.sevlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// !!! 사용하기 전에  StudySuvletsApplication 에 가서 @ServletComponentScan 넣어줘야함
// 웹 별칭 매칭해줌    @ = 어노테이션 방식    spring에서 엄청 씀  http:~~~~:8080 까지는 알아서 넣어줌
@WebServlet(urlPatterns = "/dispatcherJSPServlets")
public class DispatcherJSPServlets extends HttpServlet {
   
    protected void	doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{ 

                // 히든 넣는법
        String hiddenParam = request.getParameter("hiddenParam");
        request.setAttribute("firstName", "jhunlab");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/search_form.jsp");
        requestDispatcher.forward(request, response);  //add throw 하고



    }
}
