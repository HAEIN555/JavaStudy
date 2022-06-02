package com.except;

public class Except03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(0/0); //예외 처리 하기 위한 문장
		System.out.println(4);
		}catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException ) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		}catch (Exception e) {
			System.out.println("Excetpion..");
		}finally {
			// 무조건 실행 
			System.out.println(5);
		}
			System.out.println(6);
	}
	// instanceof 는 업캐스팅 다운캐스팅에 나온당 

}
