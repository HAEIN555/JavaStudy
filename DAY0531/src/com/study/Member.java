package com.study;

public class Member {
	
	private String name;
	private int  height;
	private int weight;
	private String nation;
	
	public Member(String name,int height,int weight, String nation) {
		this.name = name;
		this.height = height;
		this.weight= weight;
		this.nation = nation;
	}
	// Getter 와 Setter 사용하기 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
		

}
