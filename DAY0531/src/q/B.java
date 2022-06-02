package q;

		class FinalClass{
		 protected final int finalMethod() {
			 return 0;
		 }
		 class SubClass extends FinalClass{
			//protected int finalMethod() {return0;} 
		 }
	 }
		/*
		 * class Subcalss extends FinalClass{ //final은 상속이 불가능 하니까..! }
		 */
public class B {
	public int n ;
	public void g() {
		n=5;
	}
	// 만약 public에서 private으로 바꾼다면?
	// private는 접근이 불가능하다 동일한 패키지 내에서도 다른 클래스에서는 접근이 불가능 하다 
	
	// 만약 protected라면
	// 같은 패키지에서는 접근이 가능하지만 다른 패키지인 경우 접근이 불가능하다 
	
	// 접근제한자를 생략하는 것이 default 이다. 동일한 패키지 내에 있는 클래스만 접근 가능 
	// 다른 패키지에 있는건 접근이 불가능하다. 
}
