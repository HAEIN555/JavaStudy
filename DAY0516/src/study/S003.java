package study;

class Car{
	String color;
	//private int speed; 라고 한다면 접근을 제한하는 private 이라고 한다. 
	// private을 피하기 위해서는 setter을 이용한다. 
	int speed;
	void upSpeed(int value) {
		speed =speed +value;
	}
	void downSpeed(int value) {
		speed =speed -value;
	}
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	// getter 는 값을생성해주는거 setter는....값을 설정하거나변경?
	
}
public class S003 {

	public static void main(String[] args) {
		
		Car car1 =new Car();
				//new 생성자 함수 클래스에 하나는 존재한다. 
				// 클래스명과 동일하다 
		car1.color="보라색"; // car 클래스 맴버 변수에 값을 설정한다. 
		car1.speed=0;
		// car 클래스의 up speed(30)메소드에 30을 매게 변수에 값을 대입했다. 
		car1.upSpeed(30);
		
		System.out.println(car1.getColor());// 값이 변한것을 활용할때 
		System.out.println(car1.getSpeed());
		
	}
}
