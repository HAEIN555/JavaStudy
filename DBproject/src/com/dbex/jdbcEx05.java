package com.dbex;
/* 정적 - 집어넣을때 값이 정해지는 거! 
 * 			statement 객체 사용
 * 동적 - 자리만 만들어놓아서 그때그때마다 들어가는 값이 틀리다 . 
 *			값이 변화가 되는 것들을 모아놓은거! 그래서 자리를 만들어놓아야 한다!!! 
 *			DB에서는 바인딩 변수라고 한다 값은 바뀔 수 있지만 자리는 바뀌어서는 안된다!!!
 *			preparedstatement 객체 사용 
 *		오늘은 동적을 활용해서 db에 저장!하는거 해본다
 *
 */
/* 오라클에서 전송된 SQL문은 parsing - > execute plan -> fetch의 작업을 한 이후에 
 * SQL 문을 수행결과를 DataBuffer Cache에 저장함
 * 
 * 똑같은 SQL이 전송되면 Library cache에 저장된 SQL의 Parsing결과와 execute plan의 그대로 
 * 사용하게 됨으로 속도향상에 도움을 줌
 * 
 * preparedStatement는 SQL의 형태는 동일하나 조건이나 변수 값이 다른 문장을 바인딩변수를 사용해서 변수
 * 처리함으로써 항상 동일한  SQL문을 동일하게 처리할 수 있다. 
 * 
 * --- PreparedStatement객체의 생성과 바인딩변수의 사용
 * 
 * 	바인딩 변수는 실제값으로 대체될 부분에 사용함
 *  														컬럼명  -	 deptno ,dname,college,loc
 *  																		203  컴퓨터공학과	200	7호관
 * 		String sql = "insert into department values(?,?,?,?)";
 * 					물음표 자체가 바인딩 변수이다ㅏ 값이 바뀌기 때문에 자리를 만들어 놓는것!  
 * 				PreparedStatement pstmt = con.preparestatement(sql);
 * 				
 * 					먼저 인덱스 값이 먼저 와야한다. 
 * 		바인딩 변수의 갯수 만큼 순서대로 해당변수와 대체될 값을 지정해준다. 
 * 				pstmt.setInt(1,203);
 * 				pstmt.setString(2,"컴퓨터공학과");
 * 				pstmt.setInt(3,200);
 * 				pstmt.setString(4,"7호관");
 * 		※※※※※※바인딩 변수는 절대! 컬럼명에는 사용할 수 가 없다!※※※※※※※※※※※
 * 		
 * 		PreparedStatement는 PreparedStatement의 바이딩 변수에 값을 지정해주는
 * 		setXXX() 메소드를 작성한다.
 * 		
 * - cache 임시 기억 장치 속도가 디게 빠르다 cpu 저장장치 하드디스크 사이에서 사용한다. 
 * 				버퍼에 계속 데이터가 쌓이는데 그걸 빼오는게 인출 parsing은 불러오는거??
 * 	- 가지고 오는건 get 저장하는 건 set이다!
 */
import java.sql.*;
public class jdbcEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//PreparedStatement를 사용하는 경우
		 		// sql쿼리에서 실제 값으로 대체될 부분을 ?처리한다. 
				// ?는 DataBase에서 sql실행시에 실제 값으로 대체된다.
				
				StringBuffer sql = new StringBuffer();
			     
				sql.append("insert  into professor ");
				sql.append("values(?,?,?,?,?,sysdate,?,?)");
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
			          pstmt.setInt(1, 9987);
			          pstmt.setString(2, "신화산");
			          pstmt.setString(3, "hwasansin");
			          pstmt.setString(4,"전임교수");
			          pstmt.setInt(5, 250);
			          pstmt.setInt(6, 32);
			          pstmt.setInt(7, 203);
			          //쿼리실행
			          int i = pstmt.executeUpdate();
			          System.out.println(i+"개의 행이 추가 되었습니다.");
			          
			        }catch (SQLException ss) {
			        ss.printStackTrace();
			        }finally {
			        	try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
			        	try {if(con !=null)con.close();}catch(SQLException s) {}
			      }// 웹프로그램을 만들때 동적으로 ~
	}

}
