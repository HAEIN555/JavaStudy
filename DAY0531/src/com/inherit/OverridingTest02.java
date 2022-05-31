package com.inherit;
class OverridingParent2{
	int money =20; 
	void parentMethod() {
		System.out.println("Parent Method...");
	}
}
class OverridingChild2 extends OverridingParent2 {
	String money ="20원";
	@Override
	void parentMethod() {
		System.out.println("overriding method...");
	}
}
public class OverridingTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money ="30원"; // int형에서 String으로 바뀌기 때문에 
		//oc2.money = 10; 이라고 하면 오류가 난다. // 부모 
		// 변수명만 같아도 된다!  부모가 가지고 있는건 숨겨지게 된다. 재정의한 변수만 인식하게 된다!
		// 자료형과 값이 변경 가능하다 private가 아니라면..!
		System.out.println(oc2.money);
	}
}
