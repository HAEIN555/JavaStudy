package com.dbex;

import java.sql.*;
public class jdbcEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				StringBuffer sql = new StringBuffer();
			       
			      sql.append("delete from department "); // ���ٷ� �� �ᵵ �ȴ� �׸��� ���� �������� �� ���� �ؾ��Ѵ�.
			      sql.append("where dname='��ǻ�Ͱ��а�'");
			      //sql.append("");
			      
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
			           stmt = con.createStatement();
			           int result =stmt.executeUpdate(sql.toString());
			           // ���� ���� ���� �����ϰ� ���̴°Ŵϱ�!!!!!!!!
			           System.out.println(result+"�� ������ �Ϸ�Ǿ����ϴ�.");
			           
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
