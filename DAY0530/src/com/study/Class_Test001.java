package com.study;
/* 지역 변수는 초기화 과정을 거치지 않으면 사용 할 수 없다. 
 * (자동 초기화 기능을 지원하지 않는다. )
 * 
 * 
 */
public class Class_Test001 {
	
	  int b; // 전역변수 (인스턴스 멤버 변수)
	  // 사용하는 과정에서 초기화하지 않을 경우 int형 기준 자동으로 0으로 초기화 됨
	  
	public static void main(String[] args) {
		
		int a =10; // 지역변수  = 초기화 해주지 않으면 error!
		System.out.println("a :"+a);
		Class_Test001 ct = new Class_Test001();
		System.out.println(ct.b);
	}

}
