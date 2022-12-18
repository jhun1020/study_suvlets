package com.jhunlab.study_suvlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/searchFormServlet")
public class SearchFormServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // 한글 인식되게 하는 법
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();

        // DatasInfor 가져오기
        DatasInfor datasInfor = new DatasInfor();
        HashMap<String, String> SearchFormData = datasInfor.getSearchFormData();
        // SearchFormData에 들어가있는 값 알아보기 

        String title = SearchFormData.get("search_key");
        printWriter.println("<html lang='en'>");

        printWriter.println("<head>");
        printWriter.println("<meta charset='UTF-8' />");
        printWriter.println("<title>"+title+"</title>");
        printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet'");
        printWriter.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' crossorigin='anonymous'>");
        printWriter.println("<link rel='stylesheet' href='./css/commons.css'>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<form action=''>");
        printWriter.println("<div class='container'>");
        printWriter.println("<div class='fs-3'>" + SearchFormData.get("name") + "</div>");
        printWriter.println("<div>");
        printWriter.println("<label for='' class='form-label'>Search with Name</label>");
        printWriter.println("<input type='text' class='form-control' placeholder='Input Name' name='' id=''>");
        printWriter.println("</div>");
        printWriter.println("</div>");
        printWriter.println("</form>");
        printWriter.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'></script>");
        printWriter.println("</body>");

        printWriter.println("</html>");
        printWriter.close();
    }




}


