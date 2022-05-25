package study;

/*  클래스명의 첫글자는 대문자로
 *  자바 프로그램을 시작할때 class,main()을 [메소드]를 기본적으로 입력한다.
 *   
 *  main() 메소드안에 소스코드를 작성하여 클래스 이름과 동일한 파일명으로 저장한다.
 *   확장자는 ~~.java  
 *  파일명과 클래스 명이 같아야 한다.  클래스가 틀리면 메인이 가지고 있는 놈이 앞에 메인에 있는 클래스 명을 같게 바꾸어 주어야 한다.
 *   클래스 메소드가 기본  form 이다.
 *   
 */




public class Test001 {
 // main() ; 메인 메소드 
	// 메인이 없으면 실행 자체가 되지 않는다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // 코딩하는 영역
		System.out.print("프로그래밍 실행 테스트 ");
		// 출력해라  메소트 print()안에 있는 문자열을 출력해라 라는 뜻
		System.out.println("프로그래밍 실행 테스트 ");
		System.out.print("프로그래밍 실행 테스트\n ");// ln과 마찬가지로 똑같이 바꾼는 것
		System.out.println("프로그래밍 실행 테스트 ");
		System.out.println("프로그래밍 실행 테스트 "); //
		
		int a=10,b=20 ;
		// C 언어는 먼저 설정해주어야 하지만 자바는 뒤에 해주어도 상관없다.
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a + ","+b);
		// +는 무조건 더하기가 아니라 연결하는 연산자이다. 문자열을 연결할때 사용하는 것은  +이다 수치일때는 더하기 아닐때는 연결
		System.out.println(b);
		
		System.out.printf("%d",a); //a를 가지고 %d 10진형식으로 찍어라  
		// 표현 형식이 그런거다.
		
		System.out.printf("%d,%d",a, b); // 각각 a 와 b에 대응하여 값이 나온다ㅣ f는 형식 이다.
		
		/* 
		 * println() 와 print() 메소드의 차이는 줄바꿂
		 * 라인 스킵 (줄바꿈) 유무에 있다.
		 * [\ n] 을 문자열에 포함하면 라인 스킵이 된다. 
		 * 
		 */
			}

}
