package study;
/*
 * 형 변환
 *   묵시적 형 변환 (자동형변환)
 * 	 	- 더 큰 자료형으로 반환(자동)
 *  	- 정보 손실 없음
 *			ex) short a,b;  
 *  				a=b=10;
 *  				int c= a+b;
 *  
 *  
 *   명시적 형 변환(강제형변환)
 *   	- 더 작은 자료형으로 변환 (명시)
 * 		- 정보의 손실 가능성이 있음
 * 			ex) int c = 0; short s= 10;
 *				 s = c + s;
 * 					문제가 생긴다.
 * 					그래서 s = (short)(c+s);
 * 		boolean형은 형 변환 불가 		
 * 		byte : char은 casting 임 --바이트는 캐릭터로 변환 가능 16비트까지??
 *  	long : float은 자동으로 실수형 처리된다. 실수형은 정수형보다 크므로 ! 	
 */
public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// 형변환이란, 변수 또는 상수 타입을 다른 타입으로 표현하고자 할 때 
		// 변환 방법은 (자료형)(변수명)
		double d = 97.64;
		
		int score = (int)d;
		//double이 int 보다 자료형이 큰데 int로 나타내고 싶어서 int 형 앞에 (int)를 사용하여 써준다.
		
		int i = 10;
		byte b =(byte) i; // 명시적 형변환 예시 
		
		// 더 큰 자료형을 작은 자료형에 집어 넣고 싶을때 그 작은 자료형을 ()로 형태로 써준다.
		
		i = 500;
		b= (byte)i; // 강제형변환 - 명시적 형변환 예시
		System.out.println(b);
		
		// 문자를 숫자로 숫자를 문자로 변환하기가 가능하다.
		/*  기본자료형을 ---> 클래스화 wrapper ---> wrapper클래스 책 490p 참고
		 *   string은 기본자료형이 아니라서 나머지 기본자료형을 이렇게 바꾸어 준다.?
		 * byte -> Byte , short -> Short , int -> Integer , long -> Long , char-> Character
		 *  int 와 char만 모든 문자를 다 받는다?
		 *   파서형을 가지고 온다.??
		 */
		
		
	}

}
