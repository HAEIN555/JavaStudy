package com.inherit;
/*	오버라이딩이 성립할 수 있는 규칙
 * - 부모 클래스와 자식 클래스 사이에서만 성립한다. 
 * - static 메소드는 클래스의 속하는 메소드 이기때문에 상속 자체가 안된다. 따라서 오바라이딩이 될 수 없다.
 * - 접근제한자가 private로 정의된 메소드는 상속 자체가 되지 않는다. 
 * - interface 를 구현해서 메소드를 오버라이딩 할때는 접근제한자를 public으로 정의 해야한다. 
 * - // 추상메소드도 public 이야 
 * - 메소드의 인자의 개수와 타입이 완전 일치해야하고 리턴타입까지 일치해야한다.
 * - 부모클래스의 메소드의 접근 제한자보다 더 좁아질 수 없다.
 * - //public>protected>default>private 
 * - 부모 클래스의 메소드보다 더 많은 예외를 던질 수 없다(예외를 던진다 -예외전가). -> 예외처리는 추후 배울 예정
 * - final(예약어) 지정된 메소드는 오버라이딩 할 수 없다. 
 * 
 */
class OverridingParent{
	void parentMethod() {
		System.out.println("Parent Method...");
	}
}
class OverridingChild extends OverridingParent{ // 상속
	// 오버라이딩은 반환형,메소드명 건드리지 않기!
	
	@Override
	void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("childMethod..."); //자신의 입맛에 맞게 바꾸는것
	}
}
public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild cc = new OverridingChild();
		cc.parentMethod(); // 나에게 맞게끔 요리 
	}
}
