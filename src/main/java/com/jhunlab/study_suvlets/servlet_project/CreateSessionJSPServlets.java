package com.jhunlab.study_suvlets.servlet_project;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /session/createJSPServlets?username=yojulab&password=1234
@WebServlet(urlPatterns = "/session/createJSPServlets")
public class CreateSessionJSPServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

       
        //display 
     
        
        
        // 로그인 
        // 주소창에 값이 들어잇어야 한다 기억해라
        // HttpSession httpSession = request.getSession();  ==>


        HttpSession httpSession = null;
        HttpSession httpSession_false = null;

        // // Not EXISTS JSESSIONID 즉 로그인을 해야 하는 상황에서 두개의 파라미터에 의해 두개 의 동작이 어떻게 달라지는지 
        // //  false는 J세션아이디가 있어야만 동작함.
        // httpSession_false = request.getSession(false);
        // httpSession = request.getSession();
        // // false는 널,  다른건 인스턴스화,   첫 로그인시 이것을 사용.


         // EXISTS JSESSIONID
         httpSession_false = request.getSession(false);
         
         httpSession = request.getSession();
        //  j세션이 없을때는 false가 널값이었는데 이번엔 값이 있다. httpSession_false.getId() 해보면 값이 낭모
        // false와 아닌 것이 같은 값을 가짐.  이것이 세션의 특징
        //  ==> false는 존재하면 인스턴스화    false가 아니면 무조건 인스턴스화
//  ==> 로그인시 로그인 정보가 있는지 없는지 부터 확인해서 정보가 없으면 새로 생성,  있으면 기존 인스턴스 사용
        String path = null;
        if("yojulab".equals(username) && "1234".equals(password)) {
            // 로그인
            
            httpSession = request.getSession(false); //존재하면 인스턴스
            if(httpSession == null){
                httpSession = request.getSession(); //무조건인스턴스
                httpSession.setAttribute("username", username);
                httpSession.setAttribute("password", password);
            }
            // 이러면 있으면 땡 없으면 들어옴,


            // create를 하지 않고 기존에 있던 것을 사용한다는 뜻
            // => ()에 false를 썼다가 에러가 나서 지웠다. 
          
            // 리퀘스트 겟세션했다는건 아이디값이 새로 생겼다는 뜻
            // request.getSession(false)를 쳐도 똑같은 번호가 나음 ==? j세션이 없을때는 둘이 똑같음, j세션이 있을때는 차이가 있다.
            // 정상적으로 사용하려면 if문까지 활용하자

            // RequestDispatcher requestDispatcher = request.getRequestDispatcher("/session/checkLogin.jsp");
            // requestDispatcher.forward(request, response);
            
            System.out.println(httpSession.getAttribute("username"));
            System.out.println(httpSession.getId());
            
            path = "/session/checkLogin.jsp";
        } else {
            // 로그아웃
            // RequestDispatcher requestDispatcher = request.getRequestDispatcher("/session/checkLogout.jsp");
            // requestDispatcher.forward(request, response);
            // 클라이언트에 세션값이 남아있나 확인해보자
            
            httpSession = request.getSession(false);
            if(httpSession != null) {
                httpSession.invalidate(); 
                // 이걸 작성했으면 세션이(여기선 jsession) 없어야하는데 남아있음 이유는 위에 32열에 
                // 위에서 이미 생성해서 남아있다고 함 
            }
            
            // 위의 invalidate가 동작하면 값이 없어졌기 때문에 값을 가져올 수 없어서 에러가 발생함,.,  그것을 확인해보려고 넣어본것임
            // System.out.println(httpSession.getAttribute("username"));
            System.out.println(httpSession.getId());

            path = "/session/checkLogout.jsp";
        }

        // 디스패처를 위에도 밑에도 둘다 하면 좋지 않은 방법 ==> 스트링에 담아 뒤에서 사용
          RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
            requestDispatcher.forward(request, response);

    }
}

// 메타인포의 리소스 밑에 session폴더를 만들었다.
