package com.dbex;
import java.sql.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
	       
	      sql.append(""); // ���ٷ� �� �ᵵ �ȴ�
	      sql.append("");
	      sql.append("");
	      
	      Connection con = null;
	      Statement stmt = null;
	      
	        try {
	           // ����̹� �˻�
	           Class.forName("oracle.jdbc.driver.OracleDriver");
	           
	           String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	           String id = "scott";
	           String password = "tiger";
	           
	           // DB����
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