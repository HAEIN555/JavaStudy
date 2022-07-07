package com.dbex;
import java.sql.*;
/* JDBC(Java DataBase Connection)를 이용한 데이터 베이스 연결방법
 * 총 6단계로 정의 가능 
 *  1단계
 *  	- import java.sql.*;
 *  2단계
 *  	- Driver 검색단계
 *  	- oracle : oracle.jdbc.driver.OracleDriver
 *  3단계
 *  	- DataBase연결
 *  	- Connection con = DriverManager.getConnection(url,id,passwd);
 *  			- oracle url : jdbc:oracle:thin:@localhost:1521(포트번호):SID(orcl)
 * 					id : 오라클  사용자 계정 password : 오라클 사용자 계정의 비밀번호 
 * ------------------------------------------------------db연결시에는 무조건 해야한다.----------------------------
 * 4단계 
 * 		- 쿼리문 작성
 * 		
 * 		정적 (값이 정해져 있는거)
 * 			Statememt Class(정적)
 * 				- Statement stmt = con.createStatement();
 * 		동적 (그때그때마다 값이 달라지는 것, 바인딩 변수를 사용한다.) 
 * 			preparedStatement (동적)
 * 				- PreparedStatement pstmt = con.prepareStatement(쿼리);
 * 
 * 5단계 : 쿼리 결과저장
 * 			(정적일때)
 * 		- ResultSet rs = stmt.executeQuery(query);// select일때 사용가능
 * 		- ResultSet rs = stmt.executeUpdate(query);// insert,update,delete일때 사용가능
 * 		 	(동적일때)
 * 		- ResultSet rs = pstmt.executeQuery(query);// select일때 사용가능
 * 		- ResultSet rs = pstmt.executeUpdate(query);// insert,update,delete일때 사용가능
 * ----------------------------------------6단계는 무조건 실행해야한다.
 * 6단계 
 * 		- 사용 후 반드시 close(); 메소드를 실행합니다. 끊어주어야한다!
 * 		- 연결해제 
 * 
 * */

public class jdbcEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바의 데이터베이스를 이용하려면 api가 있어야한다. 
		
		//db 연결 객체 선언
		Connection con = null;
		// 연결이후에 sql 관련한 statement객체 만들기
		Statement stmt = null;
		
		
		//지금은 간단히 연결만
		try {
			// jdbc드라이브 메모리에 로드 합니다. 
			Class.forName("oracle.jdbc.driver.OracleDriver");// 메모리 올리는 거! ,아니고 .이다
			// 연결객체 얻기
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("데이터베이스 연결 성공");
			//지금스는 문장에서 catch문 전까지 연결후 쓰는 것임!
			// Statement 객체 얻기
			stmt = con.createStatement();
			//sql 문 작성  쿼리문 만들기
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values(203,'연극영화과',200,'7호관')");
			//쿼리실행
			int result =	stmt.executeUpdate(sql.toString());
			// insert,update, delete를 할때 executeUpdate(sql.toString() 사용합니다.
			// select : excuteQuery();
			//select인경우에는 바로 위에것을 사용합니다.
			
			System.out.println(result+"개의 행이 추가 되었습니다.");
		} catch (ClassNotFoundException cnfe) {
			// TODO: handle exception
			cnfe.printStackTrace();}
		catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		}finally {
			try {if(stmt!=null)stmt.close();} catch (SQLException s) {}
			try {if(con!=null)con.close();} catch (SQLException s) {}
		}
		
		
		//localhost- 자기자신컴퓨터를 말하는 것 자신의 ip주소를 써도 되고 남의 ip주소를 쳐서 db를 가지고 와도 된다.
		//get connection에 치는 건 db의 설정에 보면  이따
		
		// 이제 연결성공했으니까 자바구문을 쳐서 데이터 베이스를 만든담
		
	}

}
