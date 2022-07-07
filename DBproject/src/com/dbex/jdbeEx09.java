package com.dbex;
// 파일과 연동
import java.sql.*;
import java.io.*;
import java.util.*;

public class jdbeEx09 {

		public static void main(String[] args)throws IOException{
			
					Properties pro = new Properties();
					pro.load(new FileInputStream("src/department.properties"));
					StringBuffer sql = new StringBuffer();
				
				      Connection con = null;
				      PreparedStatement pstmt = null;// 동적객체 선언
				        try {
				          //데이터베이스 연결
				          con = connUtil.getConnection();
				         /* department.properties 에 정의된 sql을 가져와서 
				          * preparedStatement 만듬
				          */
				          pstmt = con.prepareStatement(pro.getProperty("department_insert"));
				          // 쿼리의 파라미터를 세팅
				          // 쿼리의 ?(바인딩변수)에 대체될 실제값을 지정함
				          pstmt.setInt(1,100);
				          pstmt.setString(2, "산업공학과");
				          pstmt.setInt(3, 200);
				          pstmt.setString(4,"5호관");
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
