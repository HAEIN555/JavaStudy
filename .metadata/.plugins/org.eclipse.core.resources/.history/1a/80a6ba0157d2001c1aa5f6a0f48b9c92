package study;
// 실수형 배워보기
/*  	float, double : 실수형 (실수의 기본형은 double)
 */

	 //import java.lang.*; -> lang에 있는 거 가져오기 
public class D002 {
	public static void main(String[] args) {
		
		float var1, var2;
		
		var1 =3.14f;
		// float은 꼭 뒤에 소문자 f를 써주어야 한다.
		System.out.println(var1);
		var2 = 55.55f;
		System.out.println(var1);
		// 만약 double로 바꾸는 순간 f를 안써주어도 된다!
		
		double her1 = 5.664;
		System.out.println(her1);
		
		// 정수형의 또 다른 표시 
		long d1=33, d2=3333333333l;
		// 숫자가 커진 경우에 d2같은 경우에 소문자 l을 붙여주어야 에러가 나지 않는다.
		// long은 10번째 자리부터 long으로 표시해 주어야한다.
		// 9번째 까지는 int형으로 커버가 가능하지만 그다음부터 18번째 자리까지 에러가 나므로 
		// 그때는  주의하기!
		System.out.println(d2);
		
		// int A = : 4바이트 를 확보한다. (4칸이 있다고 생각!)
		//각각의 자리에 주소가 있다.(번지수) - 메모리 주소 16진수로 00000000
		//  클래스같은거는 메모리 주소를 저장하는 곳 주소에 가면 값을 끌어다 쓰는거 - 참조형이다!
		//기본 자료형 값을 저장하는것 참조 자료형은 주소값을 저장하는 것이다.
		
		
		// 문제 원의 넓이 , 반지름이 5인 원의 넒이를 구하는 프로그램을 만드시오 반지름^2*3.14
		// 문제 원의 면적 , 반지름이 5인 원의 넓이를 구하는 프로그램을 만드시오 
		
		double Area, Cir ; // 변수의 선언
		//Pi =3.141592; // /Math.PI; API 에 있으니까 굳이안넣어도 된다.
		int r =5;  //변수의 선언 및 초기화
		Area =r*r*Math.PI;
		Cir = r*2*Math.PI;
		System.out.println(Area);
		System.out.println(Cir);
		
		/* 해설 
		 * 변수가 몇개가 들어갈까 숫자가 몇개가 필요할까 고민하기
		 * 먼저 변수 선언 해주기 double Area, Cir ; , int r;
		 * 변수 초기화와 값을 대입해주기 
		 * 표시해주기 */
		
		 // 1. 주요 변수 선언 및 초기화
		  double area=0, area1=0;
		  System.out.println(area);
		  int q =5;
		 //Math.PI 굳이 가져올 필요 없다. api에 있다   //import java.lang.*; -> lang에 있는 거 가져오기 가능!
		 //2. 연산및 처리
		 // Pi 는 원주값
		area = q*q*(Math.PI);
		System.out.println("원의 넓이 : "+area+"입니다");
		
		System.out.printf("원의 넓이는%.3f\n 입니다.",area); //교재 p36 참조 
		// 소숫점 이하 3자리로 잡고 싶을때 %.3f로 표현  대응하는 area도 반드시 써주기! \n은 줄바꾸기
		//반올림 해준다. 소수점 이하 몇까지 사용하는 거는 정규화에 주로 쓰인다. 
		// 원의 둘레 
		area1= 2*q*Math.PI;
		System.out.println("원의 둘레는 :"+area1+"입니다");
		
		
		  
		
		
		
		
		
	}
}
