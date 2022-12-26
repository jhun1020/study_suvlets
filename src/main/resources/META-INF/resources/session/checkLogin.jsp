<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
  <%-- httpSession.getAttribute("username") 말고 이렇게 넘어와야한다. 이름규칙이있음 --%>
  <div>Check Login</div>
  <div> <%= session.getAttribute("username") %>  </div>
  <div> <%= session.getAttribute("password") %>  </div>
  <%-- 나는 왜 null이 넘어갔지 --%>
  <div>ID : <%= session.getId() %> </div>
  <hr>

    <div>Check Login</div>
    <div>username : yojulab</div>
    <div>password : 1234</div>
    <div>ID :</div>
  </body>
</html>
