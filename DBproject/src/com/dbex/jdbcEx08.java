package com.dbex;
import java.sql.*;

/*
 * Transaction 
 * 		- Ʈ����� : �������� �۾��� �ϳ��� ������ �۾� ������ �����ִ� ���� ����
 * 		�ϳ��� �۾� �������� ��ü �۾����� ��� �ùٸ��� ����ǰų� , �Ǵ� ��ü �۾��� 
 * 		��� ������� �ʵ��� �Ѵ�! 
 * 		
 * 		�޼ҵ� ����
 * 		commit(),rollback(),rollback(Savepoint),setSavepoint(String name),setAutoCommit(boolean value)
 * 		
 * 		
 */
public class jdbcEx08 {
	public static void main(String[] args) {
	
		/* Transaction : ������ �۾�����
		 * insert, delete,update ���� �۾����� �ϳ��� ������ �۾������� ��� 
		 * ���� ����� ��� �۾��� ����ó�� �� ��쿡�� commit�� �����ؼ� db�ݿ��ϰ�,
		 * 	���� ���� ��  �ϳ��� ����ó�� ���� �ʴ� ��� rollback�� �����ؼ� 
		 * �۾����� ���� ��� �۾��� ����Ѵ�. 
		 * 
		 */
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into department ");
		sql.append("values(?,?,?,?) ");
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname =? ,loc=? ");
		sql2.append("where deptno= ?");
		
		
	    Connection con = null;
	    PreparedStatement pstmt = null;// ������ü ����
	    
	      
	        try {
	        	
	        ///////////////////////transaction ���� ///////////////////////////////
	        	// �ϳ��� ������ �۾����� ����
	        	
	          //�����ͺ��̽� ����
	          con = connUtil.getConnection();
	         //autoCommit ��� ��Ȱ��ȭ ��Ŵ
	          con.setAutoCommit(false);
	          
	          //-----------------------------------ù ��° �۾� ������----------------
	         /* pstmt = con.prepareStatement(sql.toString());
	          pstmt.setInt(1, 255);
	          pstmt.setString(2,"�ѱ������а�");
	          pstmt.setInt(3, 200);
	          pstmt.setString(4, "9ȣ��");
	          pstmt.executeUpdate();
	          */
	         //-----------------------------------ù��° �۾� ����--------------------
	         //-----------------------------------�� ��° �۾� ������----------------
	          pstmt = con.prepareStatement(sql2.toString());
	          pstmt.setString(1, "���������а�");
	          pstmt.setString(2,"8ȣ��");
	          pstmt.setInt(3, 255);
	          pstmt.executeUpdate();
		     //-----------------------------------�ι�° �۾� ����--------------------
	         //������ ���������� ����Ȱ�� db���ݿ�
	         con.commit();
	         System.out.println("db�� ���������� �ݿ��Ǿ����ϴ�.");
	         
	        }catch (SQLException ss) {
	        // ������ ���������� ������� ���� ��� 	
	        try {
	        	con.rollback();
	        	System.out.println("db������ �۾��� ��ҵǾ����ϴ�.");
	        }catch (SQLException e) {
				e.printStackTrace();
			}	
	        
	        }finally {
	        	
	        	try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
	        	try {if(con !=null)con.close();}catch(SQLException s) {}
	      }
	}
}
