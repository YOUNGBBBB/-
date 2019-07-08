<%@page import="com.ztkj.cw.dao.UserDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userid= request.getParameter("userid");

UserDaoImpl userDaoImpl=new UserDaoImpl();
//执行删除
int result =userDaoImpl.deleteUser(Integer.parseInt(userid));

if(result>0){
	out.print("删除成功");
	request.getRequestDispatcher("userLift_sever.jsp").forward(request, response);
	
}else{
	//删除失败
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="userLift_server.jsp" name="fanhui">删除成功请单击返回</a>
</body>
</html>