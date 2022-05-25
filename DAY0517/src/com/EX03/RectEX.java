package com.EX03;
/* 사각형의 넓이와 둘레를 계산 (클래스로 표현)
 *  클래스의 속성 - 가로 세로 (넓이,둘레,무게,색깔,재질)
 *  클래스의 기능  - 넓이계산,둘레계산기능,가로와 세로값 입력기능 출력기능
 *  
 *  객체의 구성 : 데이터(속성과 상태) + 기능 ->행위 
 *  클래스의 구성 : 멤버변수 + 메소드 
 */
import java.util.*;
class Rect{ // 클래스의 정의 (설계)
	/* 멤버 변수 선언
	 * 전역변수 :  class  전체 안에서 활동 가능한 변수 (Static) 
	 * 					메소드 안에서도 활용가능한!
	 * 지역변수 :  메소드 안에서만 유효성을 가진 변수 
	 * 	(멤버변수)			  클래스에 소속되어있는 변수 
	 * 인스턴스 변수 : 인스턴스가 생성 될때를 의미 함 인스턴스는 객체 
	 * 		Rect re = new Rect(); 이객체를 생성하고 나서 사용할 수 있는 변수 
	 */
	//  가로와 세로 멤버변수 선언 
		int w,h;
	// 메소드 정의 {가로와 세로를 입력받는 기능} 
	//void :  메소드 실행 후 메소드를 호출한 곳에 결과를 돌려줄 필요가 없을때 사용한다. 
				//입력만 하면 끝!
	// return: 메소드 실행후 메소드를 호출한 곳에 결과값을 돌려줄때 return 맞나...
		void input() {
			Scanner sc = new Scanner(System.in);
			// 스캐너도 인스턴스 생성한거다! .sc라는  스캐너 인스턴스

			System.out.println("가로입력");
			w=sc.nextInt();
			System.out.println("세로입력");
			h=sc.nextInt();
		}
		// 넓이 계산 기능 (메소드 정의)
		int area() {
			int result;
			result=w*h;
			return result;
			/* 메소드는 리턴문(return)을 통해서 결과를 돌려줄 수 있다. 
			 *  돌려준다는 말은 반환한다는 말 
			 */
		}
		int length() {
			//int result;
			//result=(w+h)*2;
			return (w+h)*2 ; // 이렇게도 사용이 가능하다!
		}
		/*출력 메소드 정의
		 * 매개 변수를 통해 데이터를 넘겨받음 (갖고 있지 않는 데이터)
		 * 메소드의 매개 변수는 메소드 내에서만 활동 가능하다 
		 * 메개 변수 선언시 , 각각의 변수마다 자료형의 따로 따로 지정해야 한다. 
		 * void print(int a,int b) { -> 마치 이런거 처럼
		 */
		void print(int a,int i) {
			System.out.println("가로는 : "+w);
			System.out.println("세로는 : "+h);
			System.out.println("넓이는 : "+a);
			System.out.println("둘레는 : "+i);
		}
}
public class RectEX {

	public static void main(String[] args) {
		// 1. 인스턴스 생성 
		Rect r= new Rect();
		// 입력 메소드 호출 
		r.input();
		// 넓이와 둘레메소드 호출 
		int a= r.area(); // 넓이
		int b= r.length(); //둘레
		
		//출력 메소드 호출
		r.print(a, b);
		
		
		
		
	}

}
