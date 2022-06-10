package com.utilEx;
// 객체 - 객체 자료형  기본 자료형은 아니다 기본 자료형처럼쓰일 뿐 
// 클래스니까 생성자를 가지고 있다. 
/* String class 
 * - 문자열을 의미하는 클래스 
 * - 객체 자료형이지만 , 기본 자료형처럼 사용한다.
 * 
 * 생성자 
 * String() :  비어있는 문자열 객체를 생성하고 초기화 
 * String (char[]value) : 인장니 char배열 값의 내용을 순차적으로 배정하여 새로운 문자열을 생성
 * String(String original) : String형의 original의 문자열의 새롭게 생성된 문자열 객체 초기화 한다.
 *  설명은 api에 있거나 책에 있으니까 참고하기
 *  
 *   객체 생성법 
 *   (자동) -> 암시적 객체생성
 *   String s1 = "Test"; -> r기본 자료형처럼 생성한 것
 *   (강제)-> 명시적 객체생성  
 *   String s2 = new String("Test");
 */
// 객체는 편집되지 않는다. 더 큰것을 만들고 싶으면 배열처럼 만들어주면 된다. 
// 한번 만들어지면 변경이 되지 않는다. 
public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1 = "TEST";
			String s2 ="TEST";
			// 값이 같다. 
			if(s1==s2) // 주소값비교 
				System.out.println("s1과s2는 같다.");
			else
				System.out.println("s1과s2는 같지않다.");
			//s1과s2는 같다.
			System.out.println();
			
			String s3 = new String("Test");
			String s4 = new String ("Test");
			
			if(s3==s4)
				System.out.println("s3과s4는 같다.");
			else
				System.out.println("s3과s4는 같지않다.");
			//s3과s4는 같지않다.

			if(s1.equals(s2)) // 값 비교 
				System.out.println("s1과s2는 같다.");
			else
				System.out.println("s1과s2는 같지않다.");
			
			if(s3.equals(s4))
				System.out.println("s3과s4는 같다.");
			else
				System.out.println("s3과s4는 같지않다.");
			// 암시적 객체 생성과 명시적 객체생성의 차이점
			// 1. (==) 연산자는 객체의 주소값을 저장한다. 
			// 2. 객체의 값 비교는 equals() 메소드를 활용한다. 
			
		//StringBuffer(5+16) // hello String str = "hello" 16개가 기본인데 5를 더해주어서 21개의 초기공간을 만듦? 
			
	}

}
