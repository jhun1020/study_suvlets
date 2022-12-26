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
@WebServlet(urlPatterns = "/dispatcherServlets")
public class DispatcherServlets extends HttpServlet {
   
    protected void	doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{ 

                // 히든 넣는법
        String hiddenParam = request.getParameter("hiddenParam");

        // 히든의 값에 따라 변화를 주고 싶다.  (값에 따라 분기)
        // 히든의 값이 지정한게 아니라면 normal,  지정한 값이라면 

        // dispatcherServlets?hiddenParam=searchFormServlet      (주소창)
        if("searchFormServlet".equals(hiddenParam)){
            // a 엘리먼트와 같은 역할
            response.sendRedirect("/searchFormServlet");
        } else if("createCoolieServlets".equals(hiddenParam)){
            // dispatcherServlets?hiddenParam=createCookieServlets
            // 이번에 사용할 것은 request에 던짐 
            // 위는 파라미터를 포함시켜서 보낼수가 없지만 여기선 가능.
            // 원래 자신이 가지고 있던 값을 가진 상태로 갈 수 있음.

            // ++ request를 추가해서 보낼 수도 있음
            request.setAttribute("firstName", "jhunlab");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("cookies/createServlets");
        //   확인을 위해 변수에 담은 것.
            requestDispatcher.forward(request, response);  //add throw 하고
        } else {   

            // normal display
        String message = "HelloWorldServlets with Message!";
        PrintWriter printWriter = response.getWriter();

        printWriter.println(" <html lang='en'>");
        printWriter.println(" <head>");
        printWriter.println(" <title>" + message +"</title>");
        printWriter.println(" </head>");
        printWriter.println(" <body>");
        printWriter.println(" <div>Dispatcher Servlets !</div>");

        printWriter.println("</body>");
        printWriter.println(" </html>");
        printWriter.close();

        } 


    }
}
