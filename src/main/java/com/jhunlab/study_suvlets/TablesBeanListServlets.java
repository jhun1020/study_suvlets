package com.jhunlab.study_suvlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.jhunlab.beans.MemberBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/TablesBeanListServlets")
public class TablesBeanListServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        DatasInfor datasInfor = new DatasInfor();
        ArrayList<String> tablesListWithString =   datasInfor.getTablesListWithString();
        PrintWriter printWriter = response.getWriter();

        HashMap<String, String> searchForm = datasInfor.getSearchFormData();

        printWriter.println("  <html lang='en'> ");
        printWriter.println(" <head> ");
        printWriter.println(" <meta charset='UTF-8'> ");

        printWriter.println(" <title> " + searchForm.get("search_key") + "</title> ");
        printWriter.println(" <link ");
        printWriter.println(" href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' ");
        printWriter.println(" rel='stylesheet' ");
        printWriter.println(" integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' ");
        printWriter.println(" crossorigin='anonymous' ");
        printWriter.println(" /> ");
        printWriter.println(" <link rel='stylesheet' href=''./css/commons.css' /> ");
        printWriter.println(" </head> ");
        printWriter.println(" <body> ");
        printWriter.println(" <div class='container'> ");
        printWriter.println(" <div class='fs-3'>Tables With Bean</div> ");
        printWriter.println(" <table class='table'> ");
        printWriter.println(" <thead> ");
        printWriter.println(" <tr> ");
        printWriter.println(" <th scope=>#</th> ");
        // printWriter.println(" <th scope=>First</th> ");
        // printWriter.println(" <th scope=>Last</th> ");
        printWriter.println(" <th scope=>Handle</th> ");
        printWriter.println(" </tr> ");
        printWriter.println(" </thead> ");
        printWriter.println(" <tbody> ");
// -------------------------------
        // ArrayList<MemberBean> dataListWithMemberBean = (ArrayList<MemberBean>) bundlesData.get("dataListWithMemberBean");
        // for(int i=0; i<dataListWithMemberBean.size(); i++){
        //     printWriter.println("                <tr>");
        //     printWriter.println("                    <th scope=>"+(i+1)+"</th>");
        //     String handle = temp.get(i);
        //     printWriter.println("                    <td>"+handle+"</td>");
        //     printWriter.println("                </tr>");
        // }




        // ---------------------------------
        // ???????????? ????????? ??????????????? ???????????? ???????????? ????????????
        // for(int i=0; i< tablesListWithString.size(); i++){
        //     printWriter.println(" <tr> ");
        //     printWriter.println(" <th scope=>"+(i+1)+"</th> "); //1 2 3 ??????
        //     // ????????? ????????? ????????? ?????? ?????????
        //     String handle = tablesListWithString.get(i);
        //     printWriter.println(" <td>" + handle +"</td> "); // handle ????????? @mdo, @fat~~~
        //     printWriter.println(" </tr> ");
        // } 
// ----------------------------------------
        // printWriter.println(" <tr> ");
        // printWriter.println(" <th scope=>1</th> ");
        // // printWriter.println(" <td>Mark</td> ");
        // // printWriter.println(" <td>Otto</td> ");
        // printWriter.println(" <td>@mdo</td> ");
        // printWriter.println(" </tr> ");
        // printWriter.println(" <tr> ");
        // printWriter.println(" <th scope=>2</th> ");
        // // printWriter.println(" <td>Jacob</td> ");
        // // printWriter.println(" <td>Thornton</td> ");
        // printWriter.println(" <td>@fat</td> ");
        // printWriter.println(" </tr> ");
        // printWriter.println(" <tr> ");
        // printWriter.println(" <th scope=>3</th> ");
        // // printWriter.println(" <td>Larry the Bird</td> ");
        // // printWriter.println(" <td>jhunBird</td> ");
        // printWriter.println(" <td>@twitter</td> ");
        // printWriter.println(" </tr> ");

        printWriter.println(" </tbody> ");
        printWriter.println(" </table> ");
        printWriter.println(" </div> ");
        printWriter.println(" <script ");
        printWriter.println(" src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js' ");
        printWriter.println(" integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4' ");
        printWriter.println(" crossorigin='anonymous'></script> ");
        printWriter.println(" </body> ");
        
        printWriter.close();
    }
}
