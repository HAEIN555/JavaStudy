package com.dbex;
// 동적으로 정보 수정
import java.sql.*;
public class jdbcEx06 {

	public static void main(String[] args) {
		//PreparedStatement를 사용하는 경우
 		// sql쿼리에서 실제 값으로 대체될 부분을 ?처리한다. 
		// ?는 DataBase에서 sql실행시에 실제 값으로 대체된다.
		
		StringBuffer sql = new StringBuffer();
	     
		sql.append("update  professor ");
		sql.append("set sal = ? ");
		sql.append("where name = ? ");
		//sysdate는 바인딩 처리 안해서! 
		
		// 만약 static이라면 
		//sql.append("insert  into professor ");
		//sql.append("values(?,?,?,?,?,sysdate,?,?)"); ? 안에 값을 다 넣어줌
		
	      Connection con = null;
	      PreparedStatement pstmt = null;// 동적객체 선언
	      
	        try {
	          //데이터베이스 연결
	          con = connUtil.getConnection();
	          System.out.println("데이터베이스 연결성공");
	          
	          pstmt = con.prepareStatement(sql.toString());
	          // 쿼리의 파라미터를 세팅
	          // 쿼리의 ?(바인딩변수)에 대체될 실제값을 지정함
	          // (1,500)인덱스 값은 1 이다! 
	          pstmt.setInt(1, 500);
	          pstmt.setString(2, "신화산");
	         
	          //쿼리실행
	          int i = pstmt.executeUpdate();
	          System.out.println(i+"개의 행이 수정 되었습니다.");
	          
	        }catch (SQLException ss) {
	        ss.printStackTrace();
	        }finally {
	        	try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
	        	try {if(con !=null)con.close();}catch(SQLException s) {}
	      }// 웹프로그램을 만들때 동적으로 ~
	}

}
