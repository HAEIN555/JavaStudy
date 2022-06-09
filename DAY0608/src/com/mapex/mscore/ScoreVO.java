package com.mapex.mscore;

public class ScoreVO {
	
	private String name, hak;
	private int kor,eng,mat,tot;
	
	
	@Override // 오버라이드로 만들어주기 
	public String toString() {
		// TODO Auto-generated method stub
		String str = String.format("%7s%10s%5d%5d%5d%5d%6.1f",
				hak,name,kor,eng,mat,getTot(),(double)getTot()/3);
		return str;
	}
	//getter ,setter만들어주기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
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
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot = kor+eng+mat;
		return tot;
	}

	
}
