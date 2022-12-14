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
        String message = "HelloWorldServlets with Message!";

        PrintWriter printWriter = response.getWriter();

        printWriter.println(" <html lang='en'>");
        printWriter.println(" <head>");
        printWriter.println(" <title>" + message +"</title>");
        printWriter.println(" </head>");
        printWriter.println(" <body>");
        printWriter.println(" <div>HelloWorldServlets !</div>");
        printWriter.println("</body>");
        printWriter.println(" </html>");


        printWriter.close();

    }
}
