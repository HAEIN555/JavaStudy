package com.dbex;
import java.sql.*;
public class connUtil {

	static {// 공통영역 객체 없이도 가능!
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
	}
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl",
				"scott", "tiger"); // 연결하는거 

		
       
	}
}
