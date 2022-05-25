package com.inter2;
public class InterfaceExam implements Inter3 {
	int a =100;
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a+10;
	}
	public static void main(String[] args) {
		InterfaceExam it = new InterfaceExam();
		//interface 의 다형성
		Inter1  it1 = new InterfaceExam();
		// Inter1 it= it;
		Inter2 it2 = new InterfaceExam();
		Inter3  it3 = it;	
		System.out.println(it1.getA()); //100
		System.out.println(it2.getA()); //100
		System.out.println(it3.getData()); //110
		
		System.out.println(it instanceof  Object); //true
		System.out.println(it instanceof  InterfaceExam); //true
		System.out.println(it instanceof  Inter1); //true
		System.out.println(it instanceof  Inter2); //true
		System.out.println(it instanceof  Inter3); //true
	}// 부모가 생성할 수 없어서 자식을 사용해서 만든다..?
}
