package com.jhunlab.study_suvlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// !!! 사용하기 전에  StudySuvletsApplication 에 가서 @ServletComponentScan 넣어줘야함
// 웹 별칭 매칭해줌    @ = 어노테이션 방식    spring에서 엄청 씀  http:~~~~:8080 까지는 알아서 넣어줌
@WebServlet(urlPatterns = "/helloWorldServlets")
public class HelloWorldServlets extends HttpServlet {
    // 메인을 넣을 필요가 없음  서버가 이미 메인으로 돌아가고 있음.
    // 그럼 연결고리가 필요 => 상속!!
    // 그냥 상속만 하면 안되고 http더해주고 import까지
    // https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html 여기서 가져옴
    protected void	doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{ 
        // response할때 톰캣을 거쳐서 클라이언트에게 감   html css js 만 웹페이지가 인식함 ==>
        // request,  response


        // _______  12.16  +a
        // request.getParameter()
        String firstName = request.getParameter("firstName");
        String secondName = request.getParameter("secondName");
                // 히든 넣는법
        String hiddenParam = request.getParameter("hiddenParam");
        // --------

        String message = "HelloWorldServlets with Message!";
        PrintWriter printWriter = response.getWriter();

        printWriter.println(" <html lang='en'>");
        printWriter.println(" <head>");
        printWriter.println(" <title>" + message +"</title>");
        printWriter.println(" </head>");
        printWriter.println(" <body>");
        printWriter.println(" <div>HelloWorldServlets !</div>");
        printWriter.println(" <div>firstName : " +firstName +" </div>");
        printWriter.println(" <div>secondName : " +secondName +" </div>");
// 자기 자신을 다시 부르는 방법
        printWriter.println("  <form action='/helloWorldServlets' method='get'>");
        // value 넣어서 받은 값으로 초기값 세팅
        printWriter.println("  <input type='text' name='firstName' value='" + firstName + "' />");
        printWriter.println("  <input type='text' name='secondName'value='" + secondName + "' />");
        // 버튼에 recall넣어서 기존의 버튼과 구별할 수 있도록 다른 특별한 기능은 없다
        printWriter.println("  <button>recall helloWorldServlets</button>");
        printWriter.println("  </form>");

        printWriter.println("</body>");
        printWriter.println(" </html>");


        printWriter.close();

    }
}
