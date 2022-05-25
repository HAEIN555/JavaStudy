package study;

public class MethodEX02_01 {
	public static void X() { // 전역변수를 지정...? 메소드를 만들어준다?
		for(int a=0;a<5;a++) {
			System.out.print("*");
		}//void는 return이 생략// 결과형 return 값이 void일 경우 return문은 생략 가능하다. 
		return;
	}
	
	public static void main(String[] args) {
		// *을 찍기 위해서 메소드 호출을 한다. 
		X();// 결과 값이 없기 때문에 구냥 메소드를 불러오는 호출하면 된다
		System.out.println("\nHello");
		X();
		System.out.println("\nJAVA");
		X();
		System.out.println("\n!!!!!");
		X();
		// 메소드를 사용해서 만든다면 코드가 상당히 간단해진다! 
		//기능을 만들어 놓고 여기저기로 붙여사용하는 것 
		// 코드에 대한 중복이 일어나는 것을 줄여주는 효과! 가독성높아짐
		// 인스턴스 메소드 객체를 생성해야지만 사용할 수 있는 메소드 
		// 참조변수 주소값
		// 참조변수  = 배열 , 클래스 , 
		// 메소드가 값을 넘겨줄때 2가지 방법 참조값을 넘겨주는 거 값을 넘겨줄때는 call by value
		// 참조값을 불러오는 건 call by reference?????????
		// 책 277 쪽 부터 참고 
		
}	
}
