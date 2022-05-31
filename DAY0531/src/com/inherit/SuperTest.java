package com.inherit;
class Sawon{
	String name;
	String dept;
	int salary;
	String displayInfo() {
		return "이름 :"+name+",부서 :"+dept+"연봉 :"+salary;
	}
}
class Sales extends Sawon{
	int commition;
	@Override
	String displayInfo() {
	
		// TODO Auto-generated method stub
		return super.displayInfo()+",수당"+commition;
		//super은 부모의 메소드 
	}
}
public class SuperTest {
	public static void main(String[] args) {
		
		Sales s = new Sales();
		System.out.println(s.displayInfo());
	}
}
