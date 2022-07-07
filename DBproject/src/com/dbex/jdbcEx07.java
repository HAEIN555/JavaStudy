package com.dbex;
// ������ ��ȸ�Ҷ� 
import java.sql.*;
public class jdbcEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PreparedStatement�� ����ϴ� ���
 		// sql�������� ���� ������ ��ü�� �κ��� ?ó���Ѵ�. 
		// ?�� DataBase���� sql����ÿ� ���� ������ ��ü�ȴ�.
		
		StringBuffer sql = new StringBuffer();
	     
		sql.append("select a.name,a.profno,a.position, b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno = b.deptno ");
		sql.append("and a.deptno = ? ");
		//sysdate�� ���ε� ó�� ���ؼ�! 
		
		// ���� static�̶�� 
		//sql.append("insert  into professor ");
		//sql.append("values(?,?,?,?,?,sysdate,?,?)"); ? �ȿ� ���� �� �־���
		
	      Connection con = null;
	      PreparedStatement pstmt = null;// ������ü ����
	      ResultSet rs = null;
	      
	        try {
	          //�����ͺ��̽� ����
	          con = connUtil.getConnection();
	          System.out.println("�����ͺ��̽� ���Ἲ��");
	          
	          pstmt = con.prepareStatement(sql.toString());
	          // ������ �Ķ���͸� ����
	          // ������ ?(���ε�����)�� ��ü�� �������� ������
	          // (1,500)�ε��� ���� 1 �̴�! 
	          pstmt.setInt(1, 203);
	          
	         
	          //��������
	          rs= pstmt.executeQuery();
	          // ��� ���տ��� �� �����ϱ�
	          while(rs.next()) {
	        	  System.out.print(rs.getString("name")+"\t");
	        	  System.out.print(rs.getInt("profno")+"\t");
	        	  System.out.print(rs.getString("position")+"\t");
	        	  System.out.println(rs.getString("dname")+"\t");
	          }
	       
	          
	        }catch (SQLException ss) {
	        ss.printStackTrace();
	        }finally {
	        	try {if(rs !=null)rs.close();}catch(SQLException s) {}
	        	try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
	        	try {if(con !=null)con.close();}catch(SQLException s) {}
	      }// �����α׷��� ���鶧 �������� ~
	}

}
