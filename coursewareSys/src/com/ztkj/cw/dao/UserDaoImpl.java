package com.ztkj.cw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ztkj.cw.po.Role;
import com.ztkj.cw.po.User;
import com.ztkj.cw.util.JDBCUtil;

public class UserDaoImpl {
	public User login(String username, String pwd){
		User user = null;
		Connection connection = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			// 获取数据库连接
			connection = JDBCUtil.getCon();
			
			// 登录的sql语句
			String sql = 
		"select * from t_user where username=? and pwd=?";
			// 创建一个预编译的执行SQL窗口
			pstm = connection.prepareStatement(sql);
			// 给SQL语句中的占位符?赋值
			pstm.setString(1, username);
			pstm.setString(2, pwd);
			
			// 执行查询的SQL语句
			rs = pstm.executeQuery();
			
			// 处理结果集
			if (rs.next()) {
				// 创建用户对象
				user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setUsername(username);
				user.setPwd(pwd);
				user.setRname(rs.getString("rname"));
				
				Role role = new Role();
				role.setRid(rs.getInt("roleid"));
				
				user.setRole(role);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 释放数据库资源
				JDBCUtil.closeAll(connection, pstm, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return user;
	}
	/*
	 * 
	 */
	public List<User>  getAllUser(){
		List<User> users=new ArrayList<User>();
		Connection connection = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			// 获取数据库连接
			connection = JDBCUtil.getCon();
			
			// 登录的sql语句
			String sql = "select * from t_user ";
			// 创建一个预编译的执行SQL窗口
			pstm = connection.prepareStatement(sql);
			
			
			// 执行查询的SQL语句
			rs = pstm.executeQuery();
			
			// 处理结果集
			while (rs.next()) {
				// 创建用户对象
				
				User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setUsername(rs.getString("username"));
				user.setPwd(rs.getString("pwd"));
				user.setRname(rs.getString("rname"));
				user.setBirthday(rs.getDate("birthday"));
				user.setCellphone(rs.getString("cellphone"));
				user.setAddress(rs.getString("address"));
				Role role = new Role();
				role.setRid(rs.getInt("roleid"));
				users.add(user);//将对象添加到集合中
				user.setRole(role);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 释放数据库资源
				JDBCUtil.closeAll(connection, pstm, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return users;
	}
	public int deleteUser(int userid) {
		Connection connection=null;
		PreparedStatement psmt= null;
		ResultSet rs= null;
		int result=0;
		try {
			String sql="delete from t_user where userid=?";
			//建立连接
			connection=JDBCUtil.getCon();
			psmt =connection.prepareStatement(sql);
			psmt.setInt(1,userid);
			psmt.executeUpdate();//执行sql语句
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				JDBCUtil.closeAll(connection, psmt, rs);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return result;
	}
	public int inserUser(User user) {
		String sql="insert into t_user(username,pwd,rname,birthday,cellphone,address,roleid) values(?,?,?,?,?,?,?)";
		Connection connection=null;
		PreparedStatement psmt= null;
		ResultSet rs= null;
		int result=0;
		try {
			
			//建立连接
			connection=JDBCUtil.getCon();
			psmt =connection.prepareStatement(sql);
			psmt.setString(1,user.getUsername());
			psmt.setString(2,user.getPwd());
			psmt.setString(3,user.getRname());
			psmt.setString(4,user.getBirthday().toString());
			psmt.setString(5,user.getCellphone());
			psmt.setString(6,user.getAddress());
			psmt.setInt(7,user.getRole().getRid());
			result=psmt.executeUpdate();//执行sql语句
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				JDBCUtil.closeAll(connection, psmt, rs);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return result;
	}
}
