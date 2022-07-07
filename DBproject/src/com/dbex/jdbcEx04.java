package com.dbex;
//  db�˻��ϴ°�
import java.sql.*;

public class jdbcEx04 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				StringBuffer sql = new StringBuffer();
			       
			      sql.append("select deptno, dname, college,loc "); // ���ٷ� �� �ᵵ �ȴ�
			      sql.append("from department ");
			     // sql.append("");
			      
			      Connection con = null;
			      Statement stmt = null;
			      ResultSet rs = null;
			     /*select������ ���� ��� ���հ� ��� ���տ��� �����͸� ������ �� �ִ� 
			      * �޼ҵ带 ���� ��ü�� ResultSet�̴�.  */ 
			 
			        try {
			           // ����̹� �˻�
			           Class.forName("oracle.jdbc.driver.OracleDriver");
			           
			           String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			           String id = "scott";
			           String password = "tiger";
			           // DB����
			           con = DriverManager.getConnection(url, id, password);
			           stmt = con.createStatement();
			           // �����ϰ��� �ϴ� sql�� select�ΰ�� ���������� ��������� ���Ϲ��� �� �ִ�
			           // executeQuery()�� ����Ѵ�.
			           rs = stmt.executeQuery(sql.toString());
			           // ���Ϲ޾� ��������� rs�� ������ �ִ�.
			           /* resultSet ��ü�κ��� ������ �������ش�.
			            * resultSet�� next()�޼ҵ�� Ŀ���� ���������� �̵���Ų��.
			            * �̵��� ��ġ�� row(��)�� �����ϸ� true, �������� ������ false�� ��ȯ�Ѵ�.
			            * rs.next()�� ���ε���, �� ��� ���տ� ���� �����ϴ� ���� ResultSet���� ���� 
			            * �����͸� �����մϴ�. 
			            * while(rs.next()){
			            * }
			            */
			           while(rs.next()){
				       //Ŀ���� ��ġ�� row�� column���� ���� �����ϱ�
			           // resultSet�� getXXX(�÷��� ��ġ),getXXX("�÷��̸�") 
			          // �޼ҵ带 �̿��ؼ� column ���� ������
			        	   int i = rs.getInt(1); // rs.getInt("deptno");
			        	   String s1 =rs.getString(2);
			        	   int j = rs.getInt(3);//int j = rs.getInt("college");
			        	   String s2= rs.getString("loc");
			        	   System.out.println(i+"\t"+s1+"\t"+j+"\t"+s2); }
			        } catch (ClassNotFoundException cnfe) {
			        cnfe.printStackTrace();
			        }catch (SQLException ss) {
			        ss.printStackTrace();
			        }finally {

			        	try {if(rs !=null)rs.close();}catch(SQLException s) {}
			        	try {if(stmt !=null)stmt.close();}catch(SQLException s) {}
			        	try {if(con !=null)con.close();}catch(SQLException s) {}
			      }
	}

}
