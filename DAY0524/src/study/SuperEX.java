package study;

class Super{// 부모 클래스 
	int a =5; // 부모 클래스의 멤버 변수 
	
	public Super(int x) {
		System.out.println("부모클래스 생성자 :"+x);
	}
	
}
class Sub extends Super{
	int a =10;
	public Sub() {
		super(5);
		System.out.println("자식클래스의 생성자");
	}
	// 자식과 부모가 변수가 똑같다
	public void test() {
		System.out.println(this.a); //sub의 저장되어있던 int a의 값이 나온다.
		System.out.println(super.a); // Super에 저장되어 있던 int a 값이 나올때
		// 자식과 부모의 변수가 같을때 나타내는 법
	}
}


public class SuperEX {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.test();
	}

}
