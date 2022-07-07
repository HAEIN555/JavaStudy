package com.dbex;
import java.sql.*;

public class jdbcEx02 { // update����! : �а����� ��ǻ�� ���а��� ���������� �а���ȣ 203�� Ȱ���ؼ�!

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		//buffer�ӽñ�����
		sql.append("update department ");
		sql.append("set dname ='��ǻ�Ͱ��а�'");
		sql.append("where deptno=203");
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			//����̺� �˻�
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id="scott";
			String password = "tiger";
			
			//��� �˻�
			con = DriverManager.getConnection(url,id,password);
			stmt = con.createStatement();
			
			int result =stmt.executeUpdate(sql.toString());
			System.out.println(result+"���� ������ �Ϸ�Ǿ����ϴ�.");
			
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
