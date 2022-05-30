package com.member;

public class MemberVO { //회원 정보를 저장하는 클래스
	
	private String name ;
	private String tel ;
	private String email;
	private String nation ; 
	private int age ; 

	public MemberVO(int age, String name, String tel, String email, String nation) { // 생성자 초기화
		this.age = age;
		this.name = name ;
		this.tel = tel;
		this.email = email;
		this.nation = nation ;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	
	
}
