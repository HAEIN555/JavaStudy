package com.dbex;
import java.sql.*;

/*
 * Transaction 
 * 		- 트랜잭션 : 여러개의 작업을 하나의 논리적인 작업 단위로 묶어주는 것을 말함
 * 		하나의 작업 단위내에 전체 작업들이 모두 올바르게 수행되거나 , 또는 전체 작업이 
 * 		모두 수행되지 않도록 한다! 
 * 		
 * 		메소드 종류
 * 		commit(),rollback(),rollback(Savepoint),setSavepoint(String name),setAutoCommit(boolean value)
 * 		
 * 		
 */
public class jdbcEx08 {
	public static void main(String[] args) {
	
		/* Transaction : 논리적인 작업단위
		 * insert, delete,update 등의 작업들을 하나의 논리적인 작업단위로 묶어서 
		 * 쿼리 실행시 모든 작업이 정상처리 된 경우에는 commit을 실행해서 db반영하고,
		 * 	쿼리 실행 중  하나라도 정상처리 되지 않는 경우 rollback을 실행해서 
		 * 작업단위 내의 모든 작업을 취소한다. 
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
	    PreparedStatement pstmt = null;// 동적객체 선언
	    
	      
	        try {
	        	
	        ///////////////////////transaction 시작 ///////////////////////////////
	        	// 하나의 논리적입 작업단위 시작
	        	
	          //데이터베이스 연결
	          con = connUtil.getConnection();
	         //autoCommit 기능 비활성화 시킴
	          con.setAutoCommit(false);
	          
	          //-----------------------------------첫 번째 작업 시이작----------------
	         /* pstmt = con.prepareStatement(sql.toString());
	          pstmt.setInt(1, 255);
	          pstmt.setString(2,"한국무용학과");
	          pstmt.setInt(3, 200);
	          pstmt.setString(4, "9호관");
	          pstmt.executeUpdate();
	          */
	         //-----------------------------------첫번째 작업 종료--------------------
	         //-----------------------------------두 번째 작업 시이작----------------
	          pstmt = con.prepareStatement(sql2.toString());
	          pstmt.setString(1, "공연예술학과");
	          pstmt.setString(2,"8호관");
	          pstmt.setInt(3, 255);
	          pstmt.executeUpdate();
		     //-----------------------------------두번째 작업 종료--------------------
	         //쿼리가 정상적으로 실행된경우 db에반영
	         con.commit();
	         System.out.println("db에 정상적으로 반영되었습니다.");
	         
	        }catch (SQLException ss) {
	        // 쿼리가 정상적으로 실행되지 않은 경우 	
	        try {
	        	con.rollback();
	        	System.out.println("db에대한 작업이 취소되었습니다.");
	        }catch (SQLException e) {
				e.printStackTrace();
			}	
	        
	        }finally {
	        	
	        	try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
	        	try {if(con !=null)con.close();}catch(SQLException s) {}
	      }
	}
}
