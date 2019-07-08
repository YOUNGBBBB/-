<%@page import="com.ztkj.cw.dao.UserDaoImpl"%>
<%@page import="com.ztkj.cw.po.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
request.setCharacterEncoding("utf-8");//设置编码，中文
User info=new User();
UserDaoImpl dao =new UserDaoImpl();
//如果获得参数action的值为add，则表示，操作者已经单击了提交按钮，那么实行保存

	String str= request.getParameter("userId");
	info.setUserid(Integer.parseInt(str));
	info.setUsername(request.getParameter("userName"));
	info.setPwd(request.getParameter("userpassword"));
	info.setGender(request.getParameter("sex"));
	info.setCellphone(request.getParameter("userphone"));
	info.setAddress(request.getParameter("userAddress"));
	//info.setBirthday(request.getParameter("data"));
	dao.inserUser(info);//通过dao对象调用insertUser（）方法，实现数据保存 
	
%>