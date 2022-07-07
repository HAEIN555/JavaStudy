package com.dbex;
import java.sql.*;

public class jdbcEx02 { // update수정! : 학과명을 컴퓨터 공학과로 변경조건은 학과번호 203번 활용해서!

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		//buffer임시기억공간
		sql.append("update department ");
		sql.append("set dname ='컴퓨터공학과'");
		sql.append("where deptno=203");
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			//드라이브 검색
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id="scott";
			String password = "tiger";
			
			//디비 검색
			con = DriverManager.getConnection(url,id,password);
			stmt = con.createStatement();
			
			int result =stmt.executeUpdate(sql.toString());
			System.out.println(result+"개의 수정이 완료되었습니다.");
			
		}catch (ClassNotFoundException cnfe) {
			// TODO: handle exception
			cnfe.printStackTrace();
		}catch (SQLException ss) {
			// TODO: handle exception
			ss.printStackTrace();
		}finally {
			try {if(stmt!=null)stmt.close();}catch (SQLException s) {s.printStackTrace();}
			try {if(con!=null)con.close();}catch (SQLException s) {s.printStackTrace();}
		}
		
		
		

	}

}
