package com.study;

public class Method_Test {
	
	public  void showHi() {
		System.out.println("HI ~여러분!");
		// static이 있으면 객체 생성 할 필요 없다! 모든 것을 공유해 주겠다.
		// void 가 있으면 return 문 생략
	}
	
	// 메인 또한 메소드 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static이 붙었다면 그저 메소드 호출 
		// showHi(); // 메소드 호출!
		// 만약 static이 안붙었다. 그럼 객체를 만들어주어야 한다.!
		new 	Method_Test ().showHi(); // 메소드 호출 

	}

}
