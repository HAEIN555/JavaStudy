package com.empex;

public class EmployeeVO {
	// 필드 정의
	private int no;
	private String name;
	private String jobGrade;
	private int department;
	private String email;
	private String status;
	
	public EmployeeVO() {
		
	}
	
	// 생성자
	public EmployeeVO(int no,String name,String jobGrade,int department,String email) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name= name;
		this.jobGrade=jobGrade;
		this.department= department;
		this.email= email;
		
	}
	// 생성자 매개변수 status추가
	public EmployeeVO(int no,String name,String jobGrade,int department,String email, String status) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name= name;
		this.jobGrade=jobGrade;
		this.department= department;
		this.email= email;
		this.status=status;
		
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobGrade() {
		return jobGrade;
	}
	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNo()+","+getName();
	}
}
