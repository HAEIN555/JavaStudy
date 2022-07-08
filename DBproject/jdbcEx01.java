package study;
// ������ ����!!!!!!!!!!!!!!!!
import java.sql.*;
/* ����Ŭ���� ���۵� SQL���� parsing - > execute plan -> fetch�� �۾��� �� ���Ŀ� 
 * SQL ���� �������� DataBuffer Cache�� ������
 * 
 * �Ȱ��� SQL�� ���۵Ǹ� Library cache�� ����� SQL�� Parsing����� execute plan�� �״�� 
 * ����ϰ� ������ �ӵ���� ������ ��
 * 
 * preparedStatement�� SQL�� ���´� �����ϳ� �����̳� ���� ���� �ٸ� ������ ���ε������� ����ؼ� ����
 * ó�������ν� �׻� ������  SQL���� �����ϰ� ó���� �� �ִ�. 
 * 
 * --- PreparedStatement��ü�� ������ ���ε������� ���
 * 
 * 	���ε� ������ ���������� ��ü�� �κп� �����
 * 		String sql = "insert into department values(?,?,?,?)";
 * 
 * 
 * - cache �ӽ� ��� ��ġ �ӵ��� ��� ������ cpu ������ġ �ϵ��ũ ���̿��� ����Ѵ�. 
 * 				���ۿ� ��� �����Ͱ� ���̴µ� �װ� �����°� ���� parsing�� �ҷ����°�??
 * 
 */
public class jdbcEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
	       
	      sql.append(""); // ���ٷ� �� �ᵵ �ȴ�
	      sql.append("");
	      sql.append("");
	      
	      Connection con = null;
	      PreparedStatement pstmt = null;// ������ü ����
	      
	        try {
	           // ����̹� �˻�
	           Class.forName("oracle.jdbc.driver.OracleDriver");
	           
	           String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	           String id = "scott";
	           String password = "tiger";
	           
	           // DB����
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
