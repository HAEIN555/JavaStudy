package study;

public class CircleEX01 {

	public static void main(String[] args) {
		Circle c = new Circle(10, "원");//객체가 만들어지면서 초기화 
		//출력문 필요한데 객체를 가지고 들어간다.
		System.out.println("원의 반지름은"+" "+c.radius+"이고 이름은 "+c.name+"이다.");
		System.out.println("원의 넓이는"+c.getArea()+"입니다");
	}

}
