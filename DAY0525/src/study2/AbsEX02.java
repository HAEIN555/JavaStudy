package study2;

public abstract class AbsEX02 extends AbsEX01 {
 //  추상클래스간의 상속은 재정의 해도 되고 아니여도 되고 !
	
	@Override
		public int getA() { // 부모의 추상 메소드를 재정의 했다. 
			
			return a; // AbsEX01에  변수 int a 가 있으니까 
			// 부모의 멤버 변수 이다. 
		}// 재정의 할 수 있다. 
	public abstract String getStr();
	
}
