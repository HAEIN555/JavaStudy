package com.loginex;

public class UserVO {

	private String id;
	private String password;
	private String dong;
	private int age;
	private String name;
	
	public UserVO(String id,String password,String dong,int age,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.password=password;
		this.dong =dong;
		this.age=age;
		this.name=name;
		
	} // ������ �޼ҵ�� �ʱ�ȭ 
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "���̵� :"+id+", �̸� :"+name+",���� :"+age+", ��й�ȣ :"+password+",�ּ� :"+dong;
		}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
