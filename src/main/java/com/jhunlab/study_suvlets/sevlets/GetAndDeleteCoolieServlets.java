package com.jhunlab.study_suvlets.sevlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cookies/getAndDeleteServlets")
public class GetAndDeleteCoolieServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

//  -- 화면에 출력하려면 이대로 복사해서 display로
        // //Cookie
        // // 어레이 형식이라 한번에 복수로 모두 받아와야한다.
        // // 리스트기 때문에 뽑아내려면 loop를 돌려야함
        // Cookie cookies[] = request.getCookies();
        // for(Cookie cookie : cookies){
        //     String name = cookie.getName();
        //     String value = cookie.getValue();
        // }
      

        //display 
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<div>CreateCookieServlets</div>");
 
        //Cookie
        // 어레이 형식이라 한번에 복수로 모두 받아와야한다.
        // 리스트기 때문에 뽑아내려면 loop를 돌려야함
        Cookie cookies[] = request.getCookies();
        for(Cookie cookie : cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            printWriter.println("<div>Cookie Name : " +name + "value : " + value + "</div>");

            // expiry 출력은 되고 쿠키에선 삭제    0이면 바로 삭제, 숫자 기준은 1000분의 1초
            if(name.equals("secondName")) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }

        printWriter.close();
    }
}
