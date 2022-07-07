package com.dbex;
import java.sql.*;
/* JDBC(Java DataBase Connection)�� �̿��� ������ ���̽� ������
 * �� 6�ܰ�� ���� ���� 
 *  1�ܰ�
 *  	- import java.sql.*;
 *  2�ܰ�
 *  	- Driver �˻��ܰ�
 *  	- oracle : oracle.jdbc.driver.OracleDriver
 *  3�ܰ�
 *  	- DataBase����
 *  	- Connection con = DriverManager.getConnection(url,id,passwd);
 *  			- oracle url : jdbc:oracle:thin:@localhost:1521(��Ʈ��ȣ):SID(orcl)
 * 					id : ����Ŭ  ����� ���� password : ����Ŭ ����� ������ ��й�ȣ 
 * ------------------------------------------------------db����ÿ��� ������ �ؾ��Ѵ�.----------------------------
 * 4�ܰ� 
 * 		- ������ �ۼ�
 * 		
 * 		���� (���� ������ �ִ°�)
 * 			Statememt Class(����)
 * 				- Statement stmt = con.createStatement();
 * 		���� (�׶��׶����� ���� �޶����� ��, ���ε� ������ ����Ѵ�.) 
 * 			preparedStatement (����)
 * 				- PreparedStatement pstmt = con.prepareStatement(����);
 * 
 * 5�ܰ� : ���� �������
 * 			(�����϶�)
 * 		- ResultSet rs = stmt.executeQuery(query);// select�϶� ��밡��
 * 		- ResultSet rs = stmt.executeUpdate(query);// insert,update,delete�϶� ��밡��
 * 		 	(�����϶�)
 * 		- ResultSet rs = pstmt.executeQuery(query);// select�϶� ��밡��
 * 		- ResultSet rs = pstmt.executeUpdate(query);// insert,update,delete�϶� ��밡��
 * ----------------------------------------6�ܰ�� ������ �����ؾ��Ѵ�.
 * 6�ܰ� 
 * 		- ��� �� �ݵ�� close(); �޼ҵ带 �����մϴ�. �����־���Ѵ�!
 * 		- �������� 
 * 
 * */

public class jdbcEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹ��� �����ͺ��̽��� �̿��Ϸ��� api�� �־���Ѵ�. 
		
		//db ���� ��ü ����
		Connection con = null;
		// �������Ŀ� sql ������ statement��ü �����
		Statement stmt = null;
		
		
		//������ ������ ���Ḹ
		try {
			// jdbc����̺� �޸𸮿� �ε� �մϴ�. 
			Class.forName("oracle.jdbc.driver.OracleDriver");// �޸� �ø��� ��! ,�ƴϰ� .�̴�
			// ���ᰴü ���
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("�����ͺ��̽� ���� ����");
			//���ݽ��� ���忡�� catch�� ������ ������ ���� ����!
			// Statement ��ü ���
			stmt = con.createStatement();
			//sql �� �ۼ�  ������ �����
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values(203,'���ؿ�ȭ��',200,'7ȣ��')");
			//��������
			int result =	stmt.executeUpdate(sql.toString());
			// insert,update, delete�� �Ҷ� executeUpdate(sql.toString() ����մϴ�.
			// select : excuteQuery();
			//select�ΰ�쿡�� �ٷ� �������� ����մϴ�.
			
			System.out.println(result+"���� ���� �߰� �Ǿ����ϴ�.");
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
		
		
		//localhost- �ڱ��ڽ���ǻ�͸� ���ϴ� �� �ڽ��� ip�ּҸ� �ᵵ �ǰ� ���� ip�ּҸ� �ļ� db�� ������ �͵� �ȴ�.
		//get connection�� ġ�� �� db�� ������ ����  �̵�
		
		// ���� ���Ἲ�������ϱ� �ڹٱ����� �ļ� ������ ���̽��� �����
		
	}

}
