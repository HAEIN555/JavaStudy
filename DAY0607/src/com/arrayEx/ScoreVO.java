package com.arrayEx;

public class ScoreVO { // value object 속성들만 저장합니다. 학생들의 성적정보 저장
	private String hak,name,birth;
	private int kor,eng,math,tot;
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		tot = kor+eng+math;
		return tot;
	}
	
	
	// 이클립스의 모든 문자열을 출력하고 싶다 .문자열을 반환한다?
	@Override
		public String toString() {
			
			String str = String.format("%7s%10s%8s%5d%5d%5d%5d%6.1f", 
			hak,name,birth,kor,eng,math,getTot(),(float)getTot()/3);
			
			return str;
		}

}
