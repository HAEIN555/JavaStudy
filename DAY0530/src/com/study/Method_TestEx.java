package com.study;
import java.util.*;
class Rect{ // 사각형에 대한 클래스 
	// 속성과 기능을 정의
	// 속성  - 멤버변수  기능 - 멤버 메소드
	
	//변수 선언 (가로 / 세로)
	// 전역변수 (클래스 변수 , 인스턴스 변수 )
	int w,h;
	// 메소드 선언 = 구현체가 없는 것 
	// 메소드 정의 = 기능까지 가지고 있는 것 몸체를 가지고 있는것
	// void 반환형 = 반환 값이 없음 ,( 돌려줄 값이 없음 )
	// 반환 = 메소드 실행후 결과값을 호출한 곳을 돌려주는 것을 반환이라고 함 
	
	//접근제한자인public은 생략 가능하다 그래서 void만 쓺
	void input() {
		// 인스턴스(객체,참조변수) 생성  -> 여기에 저장되는 값은...? 참조변수의 주소값!
		Scanner sc = new Scanner(System.in);
		// System. in 은 왜 들어갈까?
		//System은 무얼 의미하나 -> console을 의미!! 콘솔에데가 입력을 받아라
		// 컴퓨터와 나를 이어주는 관을 스트림이라고 한다. in -inputstream의 약자 읽어온다.
		System.out.print("가로 입력:");
		w= sc.nextInt();
		System.out.print("세로 입력:");
		h= sc.nextInt();
	}
	// 넓이 계산
	/*	 메소드 실행 후 결과가 있는 경우 (리턴형 지정)
	 * 	 리턴 자료형은 int형을 사용함 
	 */
	public int area() {
		//public int area이라고 하면 오류가 뜨는데 이것은 return 값을 안가져와서!
		// 아니면 리턴 값을 받지 않는 void로 설정
		int result  = w*h;
		// 메소드 호출시 결과값은 int형으로 오게끔 
		return	result ;
		/* 메소드는 return 문을 통해서만 결과값을 반환한다. 
		 * 
		 */
	}
	// 둘레 계산
	int length() {
		int result = 2*(w+h);
		return result;
	}
	// 결과를 출력하는 출력 메소드 
	void	print (int a,int b) { // int a,b는 매개변수와 인자값 
		// 매개변수와 인자값의 차이는? 변수이냐 값이냐의 차이 
		// 매개변수는 -  메소드의 값을 저장할 수 있는 변수 실행할때 쓰이는 값 변수 저장공간  a = area():
		// 인자 값은 -  메소드를 호출할때 Print(a) - a가 인자값 b= length();
		/* 매개 변수를 통해 넘겨 받음 (갖고 있지 않는 데이터 ) */
		System.out.println("가로 :"+w);
		System.out.println("세로 :"+h);
		System.out.println("넓이:"+a);
		System.out.println("둘레:"+b);
	}
	}
// 실행 클래스 
public class Method_TestEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect(); // 객체 생성
		r.input(); // 메소드 호출 
		int a = r.area(); // 넓이 계산 결과를 리턴 한다. 
		int b = r.length(); // 둘레를 계산한 결과를 리턴 받는다. 
		r.print(a, b); // 매개변수 2개 
	}
}
