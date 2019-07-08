<%@page import="java.util.List"%>
<%@page import="com.ztkj.cw.po.User"%>

<%@page import="com.ztkj.cw.dao.UserDaoImpl"%>
<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
UserDaoImpl userDaoImpl=new UserDaoImpl();
//
List<User> users=userDaoImpl.getAllUser();

request.setAttribute("users",users);

request.getRequestDispatcher("userList.jsp").forward(request, response);
%>