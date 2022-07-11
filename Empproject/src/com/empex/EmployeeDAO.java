package com.empex;

import java.sql.*;
import java.util.*;
/*
 * DAO(Data Access Object)
 *  - 데이터의 처리를 하는 단계
 *  - 자료를 입력받아 데이터베이스에 입력과 조회작업을 함
 */

public class EmployeeDAO {

   //   신규 사용자 등록
   public EmployeeVO getEmployeeregiste(EmployeeVO evo)throws Exception{
      
   //신규 사원 정보등록 쿼리문 작성
    String dml = "insert into employee(no,name,jobGrade,department,email)"
    		+ "values(employee_seq.nextval, ?,?,?,?)";
      
      Connection con = null;
      PreparedStatement pstmt = null;
      EmployeeVO retval = null;
      
      try {
         //데이터베이스와 연결
         con = DBUtil.getConnection();
         
         //입력받은 사용자 정보를 처리하기 위한 sql문 생성 
         pstmt = con.prepareStatement(dml);
         
         pstmt.setString(1, evo.getName());
         pstmt.setString(2, evo.getJobGrade());
         pstmt.setInt(3, evo.getDepartment());
         pstmt.setString(4, evo.getEmail());
         
         //쿼리문을 수행후 처리 결과를 얻어옴
         int i = pstmt.executeUpdate();
         
         retval = new EmployeeVO();
         
         //쿼리문을 결과를 EmployeeVO()에 저장함
         retval.setStatus(i+" ");
         
         
      } catch (SQLException e) {
         System.out.println("e:["+e+"]");
      } catch (Exception e) {
         System.out.println("e:["+e+"]");
      } finally {
         
          try {
             if(pstmt != null)pstmt.close();
             if(con != null)con.close();
          }catch(SQLException s) {
            System.out.println("s:["+s+"]");
          }
      }
      return retval;
   }//end getEmployeeregiste()
   
   
   //사원들의 번호, 이름을 입력받아 사원 정보를 조회하는 기능구현
   public EmployeeVO getEmployeeCheck(int no, String name) throws Exception{
      
      //신규 사원 정보등록 쿼리문 작성
            String dml = "select * from employee where no = ? and name = ?";
            
            Connection con = null;
            PreparedStatement pstmt = null;
            EmployeeVO retval = null;
            ResultSet rs = null;
            
            try {
               //데이터베이스와 연결
               con = DBUtil.getConnection();
               
               //입력받은 사용자 정보를 처리하기 위한 sql문 생성 
               pstmt = con.prepareStatement(dml);
               pstmt.setInt(1, no);
               pstmt.setString(2, name);
               
               rs = pstmt.executeQuery();
               if(rs.next()) {
                  retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
               }
               
            	} catch (SQLException e) {
               System.out.println("e:["+e+"]");
            	} catch (Exception e) {
               System.out.println("e:["+e+"]");
            	} finally {
               
                try {
                   if(rs != null)rs.close();
                   if(pstmt != null)pstmt.close();
                   if(con != null)con.close();
                }catch(SQLException s) {
                  System.out.println("e:["+s+"]");
                }
            }
            return retval;
      
   }
   
   //사원들의 번호를 입력받아 사원 정보를 조회
   public EmployeeVO getEmployeeNo(int no) throws Exception{
	  
       String dml = "select * from employee where no = ? ";
       
       Connection con = null;
       PreparedStatement pstmt = null;
       EmployeeVO retval = null;
       ResultSet rs = null;
       
       try {
          //데이터베이스와 연결
          con = DBUtil.getConnection();
          
          //입력받은 사용자 정보를 처리하기 위한 sql문 생성 
          pstmt = con.prepareStatement(dml);
          pstmt.setInt(1, no);
         
          
          rs = pstmt.executeQuery();
          if(rs.next()) {
             retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
          }
          
       	} catch (SQLException e) {
          System.out.println("e:["+e+"]");
       	} catch (Exception e) {
          System.out.println("e:["+e+"]");
       	} finally {
          
           try {
              if(rs != null)rs.close();
              if(pstmt != null)pstmt.close();
              if(con != null)con.close();
           }catch(SQLException s) {
             System.out.println("e:["+s+"]");
           }
       }
       return retval;
 
   }
   
   //사원들의 이름을 입력받아 사원 정보를 조회
   public EmployeeVO getEmployeeName(String name) throws Exception{
	   //신규 사원 정보등록 쿼리문 작성
       String dml = "select * from employee where  name = ?";
       
       Connection con = null;
       PreparedStatement pstmt = null;
       EmployeeVO retval = null;
       ResultSet rs = null;
       
       try {
          //데이터베이스와 연결
          con = DBUtil.getConnection();
          
          //입력받은 사용자 정보를 처리하기 위한 sql문 생성 
          pstmt = con.prepareStatement(dml);
          pstmt.setString(2, name);
          
          rs = pstmt.executeQuery();
          if(rs.next()) {
             retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
          }
          
       	} catch (SQLException e) {
          System.out.println("e:["+e+"]");
       	} catch (Exception e) {
          System.out.println("e:["+e+"]");
       	} finally {
          
           try {
              if(rs != null)rs.close();
              if(pstmt != null)pstmt.close();
              if(con != null)con.close();
           }catch(SQLException s) {
             System.out.println("e:["+s+"]");
           }
       }
       return retval;
   }
   
   //전체 사원 목록 조회
   public ArrayList<EmployeeVO>getEmployeetotal(){
	   
	   ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
	   String dml = "select * from employee ";
	   
	   Connection con = null;
       PreparedStatement pstmt = null;
       EmployeeVO emVO = null;
       ResultSet rs = null;
       
       try {
          //데이터베이스와 연결
          con = DBUtil.getConnection();
          
          //입력받은 사용자 정보를 처리하기 위한 sql문 생성 
          pstmt = con.prepareStatement(dml);
       
          rs = pstmt.executeQuery();
          while(rs.next()) {
             emVO = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
             list.add(emVO);
          }
          
       	} catch (SQLException e) {
          System.out.println("e:["+e+"]");
       	} catch (Exception e) {
          System.out.println("e:["+e+"]");
       	} finally {
          
           try {
              if(rs != null)rs.close();
              if(pstmt != null)pstmt.close();
              if(con != null)con.close();
           }catch(SQLException s) {
             System.out.println("e:["+s+"]");
           }
       }
       return list;
   }
   
   //전체 사원 목록 조회
   public ArrayList<String>getColumn(){
	   
	   ArrayList<String> columnName = new ArrayList<String>();
	   String dml = "select * from employee ";
	   
	   Connection con = null;
       PreparedStatement pstmt = null;
       ResultSet rs = null;
       ResultSetMetaData rsmd = null;
       
       try {
          //데이터베이스와 연결
          con = DBUtil.getConnection();
          
          //입력받은 사용자 정보를 처리하기 위한 sql문 생성 
          pstmt = con.prepareStatement(dml);
          rs = pstmt.executeQuery();
          rsmd = rs.getMetaData();
          
          int cols = rsmd.getColumnCount();
          
          for(int i =1;i<=cols;i++) {
        	  columnName.add(rsmd.getCatalogName(i));
          }
          
       	} catch (SQLException e) {
          System.out.println("e:["+e+"]");
       	} catch (Exception e) {
          System.out.println("e:["+e+"]");
       	} finally {
          
           try {
              if(rs != null)rs.close();
              if(pstmt != null)pstmt.close();
              if(con != null)con.close();
           }catch(SQLException s) {
             System.out.println("e:["+s+"]");
           }
       }
       return columnName;
   }
   
}