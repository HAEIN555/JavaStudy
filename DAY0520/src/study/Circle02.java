package study;

public class Circle02 {
	// 기본 생성자 활용
	
	int radius;
	
	void set(int r) {
		radius = r;
	}
	public Circle02(int r) {
		// 자동으로 생성?
		radius =r; /// 매게변수를 가진 생성자 
		
	}
	public Circle02 () {
		
	}
	public static void main(String[] args) {
		//Circle02 ce= new Circle02(); // 에러...
		// Circle02안에는 매게변수가 있다 
		// 생성자가 있을 경우 매게변수가 있다.? 
		// new 라는연산자를 넣으면 
		// 생성자가 하나라도 존재하는 
		// 이미 가지고 있는 생성자는 객체를 2개?
		
	}
}
