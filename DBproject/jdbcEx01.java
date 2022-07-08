package study;
// 오늘은 동적!!!!!!!!!!!!!!!!
import java.sql.*;
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
 * 		String sql = "insert into department values(?,?,?,?)";
 * 
 * 
 * - cache 임시 기억 장치 속도가 디게 빠르다 cpu 저장장치 하드디스크 사이에서 사용한다. 
 * 				버퍼에 계속 데이터가 쌓이는데 그걸 빼오는게 인출 parsing은 불러오는거??
 * 
 */
public class jdbcEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
	       
	      sql.append(""); // 한줄로 쭉 써도 된다
	      sql.append("");
	      sql.append("");
	      
	      Connection con = null;
	      PreparedStatement pstmt = null;// 동적객체 선언
	      
	        try {
	           // 드라이버 검색
	           Class.forName("oracle.jdbc.driver.OracleDriver");
	           
	           String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	           String id = "scott";
	           String password = "tiger";
	           
	           // DB연결
	           con = DriverManager.getConnection(url, id, password);

	           
	        } catch (ClassNotFoundException cnfe) {
	        cnfe.printStackTrace();
	        }catch (SQLException ss) {
	        ss.printStackTrace();
	        }finally {
	        	try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
	        	try {if(con !=null)con.close();}catch(SQLException s) {}
	      }
	}

}
