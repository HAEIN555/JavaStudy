package com.dbex;
// �������� ���� ����
import java.sql.*;
public class jdbcEx06 {

	public static void main(String[] args) {
		//PreparedStatement�� ����ϴ� ���
 		// sql�������� ���� ������ ��ü�� �κ��� ?ó���Ѵ�. 
		// ?�� DataBase���� sql����ÿ� ���� ������ ��ü�ȴ�.
		
		StringBuffer sql = new StringBuffer();
	     
		sql.append("update  professor ");
		sql.append("set sal = ? ");
		sql.append("where name = ? ");
		//sysdate�� ���ε� ó�� ���ؼ�! 
		
		// ���� static�̶�� 
		//sql.append("insert  into professor ");
		//sql.append("values(?,?,?,?,?,sysdate,?,?)"); ? �ȿ� ���� �� �־���
		
	      Connection con = null;
	      PreparedStatement pstmt = null;// ������ü ����
	      
	        try {
	          //�����ͺ��̽� ����
	          con = connUtil.getConnection();
	          System.out.println("�����ͺ��̽� ���Ἲ��");
	          
	          pstmt = con.prepareStatement(sql.toString());
	          // ������ �Ķ���͸� ����
	          // ������ ?(���ε�����)�� ��ü�� �������� ������
	          // (1,500)�ε��� ���� 1 �̴�! 
	          pstmt.setInt(1, 500);
	          pstmt.setString(2, "��ȭ��");
	         
	          //��������
	          int i = pstmt.executeUpdate();
	          System.out.println(i+"���� ���� ���� �Ǿ����ϴ�.");
	          
	        }catch (SQLException ss) {
	        ss.printStackTrace();
	        }finally {
	        	try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
	        	try {if(con !=null)con.close();}catch(SQLException s) {}
	      }// �����α׷��� ���鶧 �������� ~
	}

}
