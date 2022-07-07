package com.dbex;

import java.sql.*;
public class jdbcEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				StringBuffer sql = new StringBuffer();
			       
			      sql.append("delete from department "); // 한줄로 쭉 써도 된다 그리고 여긴 마지막에 꼭 띄어쓰기 해야한다.
			      sql.append("where dname='컴퓨터공학과'");
			      //sql.append("");
			      
			      Connection con = null;
			      Statement stmt = null;
			      
			        try {
			           // 드라이버 검색
			           Class.forName("oracle.jdbc.driver.OracleDriver");
			           
			           String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			           String id = "scott";
			           String password = "tiger";
			           
			           // DB연결
			           con = DriverManager.getConnection(url, id, password);
			           stmt = con.createStatement();
			           int result =stmt.executeUpdate(sql.toString());
			           // 삭제 변경 에도 동일하게 쓰이는거니까!!!!!!!!
			           System.out.println(result+"개 삭제가 완료되었습니다.");
			           
			        }catch (ClassNotFoundException cnfe) {
			        cnfe.printStackTrace();
			        }catch (SQLException ss) {
			        ss.printStackTrace();
			        }finally {
			        	try {if(stmt !=null)stmt.close();}catch(SQLException s) {}
			        	try {if(con !=null)con.close();}catch(SQLException s) {}
			      }
	}

}
