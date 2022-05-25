package com.EX03;
/*메소드
 * 1. 메소드 (멤버 함수) : 객체가 알 수 있는 동작들을 정의한 것이다.
 * 								 메소드의 종류는 2가지로 구분 짓는다.
 * 									1. 인스턴스 메소드- 객체를 만들어야지만 실행 가능
 * 									2. Static 메소드
 * 										(앞에static이 안붙으면 인스턴스 메소드이다.)
 * 
 * 우리가 정의하는 메소드- 사용자 정의 메소드
 * api에 있는 메소드 
 */
public class MethodEX01 {
		
	 public int add(int i,int j){
		return i+j;
	 	}
	
	 public int sub(int i,int j){
			return i-j;
		}
	 
	 public int multi(int i,int j){
			return i*j;
		}
	 
	 public int div(int i,int j){
			return i/j;
		}
	 public static void main(String[] args) {// 실행클래스
		int i =10;
		int j= 10;
		
		MethodEX01 me= new MethodEX01();
		
		int a,b,c,d;
		a=me.add(i, j); // 덧셈하는 기능을 가진 메소드를 호출
		b=me.sub(i, j);// 
		c=me.multi(i, j);
		d=me.div(i, j);
		
		System.out.println("더하기한 결과"+a);
		System.out.println("빼기한 결과"+b);
		System.out.println("곱하기한 결과"+c);
		System.out.println("나누기한 결과"+d);
		
	}
}
