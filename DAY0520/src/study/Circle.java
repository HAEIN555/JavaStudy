package study;

public class Circle {// 클래스 
	int radius;// 속성, 멤버변수 ; 반지름 , 필드 
	String name;  
	
	// 생성자의 궁극적인 목표는 객체가 생성될때 필드를 초기화하기위함이다. 
	
	
	// 클래스 이름과 똑같은 이름의 메소드
	public Circle() { // 컨트롤 스페이스 눌러서 가져오기 // 생성자 메소드
		// 생성자의 이름은 클래스의 이름과 같다. 필드의 초기화 필드는 멤버 속성
		radius = 1;// 생성자를 가지고 radius를 초기화 하겠다.
		name ="";// 공간은 있는데 비어있으면 그건 null 값 
		
	}

	public Circle(int r,String n) { // 매게 변수를 활용하여 필드를 초기화  오버로딩 사용
		// 매개변수로 초기화 매개변수를 가진 생성자 
		// 생성자의 return 타입은 없습니다. void 이런거 들어가지 않음 
		// 서로다른 생성자를 딱 한번만 호출한다.? 
		radius = r; // 객체를 만들때 초기값을 넣어줌
		name =n;  //
		
		//return; // 생략된거입니다
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
