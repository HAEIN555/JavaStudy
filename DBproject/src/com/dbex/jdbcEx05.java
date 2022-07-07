package com.dbex;
/* ���� - ��������� ���� �������� ��! 
 * 			statement ��ü ���
 * ���� - �ڸ��� �������Ƽ� �׶��׶����� ���� ���� Ʋ���� . 
 *			���� ��ȭ�� �Ǵ� �͵��� ��Ƴ�����! �׷��� �ڸ��� �������ƾ� �Ѵ�!!! 
 *			DB������ ���ε� ������� �Ѵ� ���� �ٲ� �� ������ �ڸ��� �ٲ��� �ȵȴ�!!!
 *			preparedstatement ��ü ��� 
 *		������ ������ Ȱ���ؼ� db�� ����!�ϴ°� �غ���
 *
 */
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
 *  														�÷���  -	 deptno ,dname,college,loc
 *  																		203  ��ǻ�Ͱ��а�	200	7ȣ��
 * 		String sql = "insert into department values(?,?,?,?)";
 * 					����ǥ ��ü�� ���ε� �����̴٤� ���� �ٲ�� ������ �ڸ��� ����� ���°�!  
 * 				PreparedStatement pstmt = con.preparestatement(sql);
 * 				
 * 					���� �ε��� ���� ���� �;��Ѵ�. 
 * 		���ε� ������ ���� ��ŭ ������� �ش纯���� ��ü�� ���� �������ش�. 
 * 				pstmt.setInt(1,203);
 * 				pstmt.setString(2,"��ǻ�Ͱ��а�");
 * 				pstmt.setInt(3,200);
 * 				pstmt.setString(4,"7ȣ��");
 * 		�ءءءءءع��ε� ������ ����! �÷����� ����� �� �� ����!�ءءءءءءءءءء�
 * 		
 * 		PreparedStatement�� PreparedStatement�� ���̵� ������ ���� �������ִ�
 * 		setXXX() �޼ҵ带 �ۼ��Ѵ�.
 * 		
 * - cache �ӽ� ��� ��ġ �ӵ��� ��� ������ cpu ������ġ �ϵ��ũ ���̿��� ����Ѵ�. 
 * 				���ۿ� ��� �����Ͱ� ���̴µ� �װ� �����°� ���� parsing�� �ҷ����°�??
 * 	- ������ ���°� get �����ϴ� �� set�̴�!
 */
import java.sql.*;
public class jdbcEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//PreparedStatement�� ����ϴ� ���
		 		// sql�������� ���� ������ ��ü�� �κ��� ?ó���Ѵ�. 
				// ?�� DataBase���� sql����ÿ� ���� ������ ��ü�ȴ�.
				
				StringBuffer sql = new StringBuffer();
			     
				sql.append("insert  into professor ");
				sql.append("values(?,?,?,?,?,sysdate,?,?)");
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
			          pstmt.setInt(1, 9987);
			          pstmt.setString(2, "��ȭ��");
			          pstmt.setString(3, "hwasansin");
			          pstmt.setString(4,"���ӱ���");
			          pstmt.setInt(5, 250);
			          pstmt.setInt(6, 32);
			          pstmt.setInt(7, 203);
			          //��������
			          int i = pstmt.executeUpdate();
			          System.out.println(i+"���� ���� �߰� �Ǿ����ϴ�.");
			          
			        }catch (SQLException ss) {
			        ss.printStackTrace();
			        }finally {
			        	try {if(pstmt !=null)pstmt.close();}catch(SQLException s) {}
			        	try {if(con !=null)con.close();}catch(SQLException s) {}
			      }// �����α׷��� ���鶧 �������� ~
	}

}
