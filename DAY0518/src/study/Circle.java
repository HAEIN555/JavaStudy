package study;

public class Circle {
	// 반지름과 원의 이름 
	int radius; // 원의 반지름  필드 속성
	String name; // 원의 이름 필드  속성
	
	//public Circle() { }
	
	public double getArea() { // 원의 면적을 구하는 메소드 
		
		
		return radius*radius*Math.PI;
	}
}
