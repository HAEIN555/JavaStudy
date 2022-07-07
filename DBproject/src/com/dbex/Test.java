package com.dbex;
import java.sql.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
	       
	      sql.append(""); // 한줄로 쭉 써도 된다
	      sql.append("");
	      sql.append("");
	      
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

	           
	        } catch (ClassNotFoundException cnfe) {
	        cnfe.printStackTrace();
	        }catch (SQLException ss) {
	        ss.printStackTrace();
	        }finally {
	        	try {if(stmt !=null)stmt.close();}catch(SQLException s) {}
	        	try {if(con !=null)con.close();}catch(SQLException s) {}
	      }
	}

}
