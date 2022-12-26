package com.jhunlab.study_suvlets.sevlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


// /session/createServlets?username=yojulab&password=1234
@WebServlet(urlPatterns = "/session/getServlets")
public class GetSessionServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // String username = request.getParameter("username");
        // String password = request.getParameter("password");

       
        //display 
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<div>Get SessionServlets</div>");
        
        
        // 로그인 
        HttpSession httpSession = request.getSession();
        String username = (String) httpSession.getAttribute("username");
        String password = (String) httpSession.getAttribute("password");



        printWriter.println("<div>"+username + ", " + password +"</div>");
  
        printWriter.close();

    }
}
