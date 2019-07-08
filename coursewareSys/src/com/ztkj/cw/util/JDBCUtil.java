package com.ztkj.cw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/courseware";
	private static final String USER = "root";
	private static final String PWD = "123456";
	
	public static Connection getCon() throws ClassNotFoundException, SQLException{
		Connection conn = null;
		
		// 第一步，加载驱动
		Class.forName(DRIVER);
		// 第二步，获取连接
		conn = DriverManager.getConnection(URL, USER, PWD);
		
		return conn;
	}
	
	
	public static void closeAll(Connection conn, Statement stm, ResultSet rs) throws SQLException {
		if (rs != null) {
			rs.close();
		}
		if (stm != null) {
			stm.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
}
