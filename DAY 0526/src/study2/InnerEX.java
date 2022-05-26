package study2;

public class InnerEX {

	public static void main(String[] args) {
		// 내부 클래스의 멤버 변수에 접근하려면 먼저 외부클래스의 객체를 생성 
		OuterEX oe = new OuterEX();
		// 외부 클래스를 통해서 내부 클래스의 객체를 생성
		OuterEX.InnerEX oi = oe.new InnerEX();
		
		System.out.println("oi.x : "+oi.x);

	}

}
