<%@page import="com.ztkj.cw.po.User"%>
<%@page import="com.ztkj.cw.dao.UserDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	// 获取用户名和密码
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	// 做登录操作
	UserDaoImpl userDao = new UserDaoImpl();
	User user = userDao.login(username, password);
	
	if(user == null){ // 登录失败，用户名或者密码错误
		request.setAttribute("tips", "用户名或密码错误");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	} else {	// 登录成功
		response.sendRedirect("index.jsp");
	}
%>