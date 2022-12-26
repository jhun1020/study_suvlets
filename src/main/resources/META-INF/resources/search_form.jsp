<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>search_form</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/commons.css" />
  </head>
  <body>
  <%-- 2022 12.23 --%>
    <div>Check Login</div>
    <div>username : yojulab</div>
    <div>password : 1234</div>
    <div>ID :</div>


<%-- ------------------------- --%>

    <%-- <%! int day = 3; %> --%>
    <!--  초기화 할떄는 %! 쓰면 된다. / 변수선언 -->
    <form action="">
      <div class="container fs-3 mt-3">Search form JSP</div>
      <div class="container">
   <%-- <% String firstName = request.getAttribute("firstName"); %> --%>
      <%-- <div align="center"><%= firstName %></div>
        <div>
          <label for="">Search with name</label>
          <input
            type="text"
            class="form-control"
            placeholder="Search Input Name"
          />
        </div>
        <% if(day == 1 || day == 7) {%>
        <div>Today is weekend <%= day %></div>
        <!-- 변수 출력은 %=   -->
        <% } else {%>
        <div>Today is NOT weekend<%= day %></div>
        <% } %> --%>
      </div>
    </form>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
