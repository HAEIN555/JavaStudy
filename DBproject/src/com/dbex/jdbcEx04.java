package com.dbex;
//  db검색하는거
import java.sql.*;

public class jdbcEx04 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				StringBuffer sql = new StringBuffer();
			       
			      sql.append("select deptno, dname, college,loc "); // 한줄로 쭉 써도 된다
			      sql.append("from department ");
			     // sql.append("");
			      
			      Connection con = null;
			      Statement stmt = null;
			      ResultSet rs = null;
			     /*select쿼리의 수행 결과 집합과 결과 집합에서 데이터를 추출할 수 있는 
			      * 메소드를 가진 객체가 ResultSet이다.  */ 
			 
			        try {
			           // 드라이버 검색
			           Class.forName("oracle.jdbc.driver.OracleDriver");
			           
			           String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			           String id = "scott";
			           String password = "tiger";
			           // DB연결
			           con = DriverManager.getConnection(url, id, password);
			           stmt = con.createStatement();
			           // 실행하고자 하는 sql이 select인경우 쿼리실행의 결과집합을 리턴받을 수 있는
			           // executeQuery()를 사용한다.
			           rs = stmt.executeQuery(sql.toString());
			           // 리턴받아 최종결과는 rs가 가지고 있다.
			           /* resultSet 객체로부터 데이터 추출해준다.
			            * resultSet의 next()메소드는 커서를 다음행으로 이동시킨다.
			            * 이동된 위치에 row(행)가 존재하면 true, 존재하지 않으면 false를 반환한다.
			            * rs.next()가 참인동안, 즉 결과 집합에 행이 존재하는 동안 ResultSet으로 부터 
			            * 데이터를 추출합니다. 
			            * while(rs.next()){
			            * }
			            */
			           while(rs.next()){
				       //커서가 위치한 row의 column에서 값을 추출하기
			           // resultSet의 getXXX(컬럼의 위치),getXXX("컬럼이름") 
			          // 메소드를 이용해서 column 값을 추출함
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
