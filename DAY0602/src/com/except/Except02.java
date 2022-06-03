package com.except;
public class Except02 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//throws new Exception(); // 예외 전가 
		// throw : 예외를 강제로 발생시킴 
						// throw new 발생시킬 예외 객체의 생성자 
		// 실행 순서 
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(0/0); 
		// 위의 구문이들어가면 4가 나오지 않음 그래서 다시 예외처리 구문을 작성해준다.
		System.out.println(4);
		}catch (ArithmeticException xe) {
			// TODO: handle exception
			//exception이 발생할때에만 사용 가능하다 
			System.out.println(5);
		}
		//System.out.println(1/0); // 라는 구문이 발생하면 예외처리가 작동! 
		catch(Exception e) {
			// TODO: handle exception
			//exception이 발생할때에만 사용 가능하다 
			System.out.println(5);
			}
		System.out.println(6);
		
	}
}
