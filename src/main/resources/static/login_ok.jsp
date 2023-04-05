<%@ page import="DriverUser.LoginService.DriverLoginServiceImpl" %>
<%@ page import="DriverUser.LoginService.DriverLoginRepository" %>
<%@ page import="java.awt.datatransfer.DataFlavor" %>

DriverUserInsertDataImpl driverUserInsertData = new DriverUserInsertDataImpl();


    

<%

    String id = request.getParameter("id"); // request.getParameter() 메서드는 HTTP 요청의 바디(body)에서 특정 파라미터의 값을 받아올 수 있는 메서드입니다
    String pw = request.getParameter("pw"); // 비밀번호 받아오기

    DriverLoginRepository driverLoginRepository = new DriverLoginRepository(id, pw);

%>

<!DOCTYPE html>



<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

<%!

%>

<%
 //   driverUserInsertData.InsertDriverJDBCConnection();
   // driverUserInsertData.InsertDriverMemberJoinData();

     // driverUserInsertData.InsertDriverLogoutData();
    // driverUserInsertData.InsertDriverDeleteData();
%>



</body>
</html>