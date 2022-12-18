package com.jhunlab.study_suvlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
// import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


    @WebServlet(urlPatterns = "/pollistServlet")
    public class PollistServlet extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");

            SurveyDatasInfor surveyDatasInfor = new SurveyDatasInfor();
       
            // datasInfor.getSearchSurvey();
            // HashMap<String, Object> surveyBundle = datasInfor.getSurveyBundle();
            ArrayList<String> surveyArrayList = surveyDatasInfor.getSurveyArrayList();
            ArrayList<String> answerArrayList = SurveyDatasInfor.getAnswerArrayList();
    
    
            // 디스플레이
            PrintWriter printWriter = response.getWriter();
    
    
            printWriter.println("<html lang='en'>");
            printWriter.println("<head>");
            printWriter.println("<meta charset='UTF-8'>");
            printWriter.println("<title>Tables Bean List Servlets</title>");
            printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet'");
            printWriter.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' crossorigin='anonymous'>");
            
            printWriter.println("</head>");
            
            printWriter.println("<body>");
            printWriter.println("<div class='container'>");      
   

            printWriter.println("<div class='mt-3'><input type='text' name='name' placeholder='name' /></div>");
            printWriter.println("<div class='mt-3 mb-3'><input type='text' name='belong' placeholder='belong' /></div>");
            
            

            for(int i=0; i<surveyArrayList.size(); i++){
                String handle = surveyArrayList.get(i);
                printWriter.println("<div class='mb-1'>" + (i+1) + ". " + handle + "</div>" );
                for(int j=0; j<answerArrayList.size(); j++){
                    String answerHandle = answerArrayList.get(j);
                    printWriter.println("<div>" + answerHandle + "</div>");
                }
                printWriter.println("<hr class='hr'>");
            }
            printWriter.println("<div class='mt-3 text-center'><input type='submit' value='submit' /></div>");
            printWriter.println("</div> ");
            printWriter.println("<script ");
            printWriter.println("src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js' ");
            printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4' ");
            printWriter.println("crossorigin='anonymous'></script> ");
            printWriter.println("</body> ");
    
            printWriter.close();
        }

    }



