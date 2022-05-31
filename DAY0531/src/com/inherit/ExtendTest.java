package com.inherit;

class Parent{
	
	int parentVar =10;
	
	void parentMethod() { // 부모의 메소드 
		System.out.println("parent Method");
	}
}

class Child	extends Parent{ // 자녀가 부모에게 상속 받았다. 
	
	int childVar =24;
	
	void childMethod() { // 자녀의 메소드 
		System.out.println("child Method");
	}
}

public class ExtendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		System.out.println(c.parentVar);
		System.out.println(c.childVar);
		c.parentMethod();
		c.childMethod();
		
	}

}
