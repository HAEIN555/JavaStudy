package com.dbex;
// 동적을 조회할때 
import java.sql.*;
public class jdbcEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PreparedStatement를 사용하는 경우
 		// sql쿼리에서 실제 값으로 대체될 부분을 ?처리한다. 
		// ?는 DataBase에서 sql실행시에 실제 값으로 대체된다.
		
		StringBuffer sql = new StringBuffer();
	     
		sql.append("select a.name,a.profno,a.position, b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno = b.deptno ");
		sql.append("and a.deptno = ? ");
		//sysdate는 바인딩 처리 안해서! 
		
		// 만약 static이라면 
		//sql.append("insert  into professor ");
		//sql.append("values(?,?,?,?,?,sysdate,?,?)"); ? 안에 값을 다 넣어줌
		
	      Connection con = null;
	      PreparedStatement pstmt = null;// 동적객체 선언
	      ResultSet rs = null;
	      
	        try {
	          //데이터베이스 연결
	          con = connUtil.getConnection();
	          System.out.println("데이터베이스 연결성공");
	          
	          pstmt = con.prepareStatement(sql.toString());
	          // 쿼리의 파라미터를 세팅
	          // 쿼리의 ?(바인딩변수)에 대체될 실제값을 지정함
	          // (1,500)인덱스 값은 1 이다! 
	          pstmt.setInt(1, 203);
	          
	         
	          //쿼리실행
	          rs= pstmt.executeQuery();
	          // 결과 집합에서 값 추출하기
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
	      }// 웹프로그램을 만들때 동적으로 ~
	}

}
