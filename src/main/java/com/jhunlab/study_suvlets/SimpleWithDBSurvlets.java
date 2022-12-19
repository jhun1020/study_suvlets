package com.jhunlab.study_suvlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.jhunlab.study_suvlets.dao.SimpleWithDB;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/simpleWithDBSurvlets")
public class SimpleWithDBSurvlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // biz with DB  
        SimpleWithDB simpleWithDB = new SimpleWithDB();
        simpleWithDB.getList();


        // display
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<div>SimpleWithDBSurvlets</div>");


        printWriter.close();
    }
}
