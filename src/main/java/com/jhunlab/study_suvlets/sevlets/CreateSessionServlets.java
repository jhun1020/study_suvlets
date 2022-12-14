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
@WebServlet(urlPatterns = "/session/createServlets")
public class CreateSessionServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

       
        //display 
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<div>CreateSessionServlets</div>");
        
        
        // 로그인 
        // 주소창에 값이 들어잇어야 된다 기억해라
        // if(username.equals("yojulab") && password.equals("1234")){
            // 밑 처럼 쓴다면 순서만 바꿨을 뿐인데 null값까지 체크해주면서 비교함  
        if("yojulab".equals(username) && "1234".equals(password)) {
            // 맞다면 로그인이 되고
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("username", username);
            httpSession.setAttribute("password", password);
            printWriter.println("<div>"+username + ", " + password +"</div>");
        } else {
            // 아니라면 fail
            printWriter.println("<div>Fail</div>");
        }
        
        printWriter.close();

    }

    // 2022 12 26 doPost
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        this.doGet(req, resp);
    }


}
