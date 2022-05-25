package study;
/* this : 객체 자신을 가르키는 레퍼런스 (참조)
 *  this는 컴파일러에 의해 자동으로 관리이므로 개발자는 this를 사용하기만 하면 됌
 *   생성자에서 다른 생성자를 호출할때는 첫번째 줄에 와야한다. 
 *   메소드의 가장 윗줄에 
 *   this라는 메소드는 다른 메소드를 불러올때 사용한다. 
 */
class CircleEX001{

	int radius;// 전역변수 
	public CircleEX001(int r/*지역변수*/) {// 이 자체가 메소드 생성자도 메소드다 객체를 생성하는 메소드 
		// 클래스를 초기화 하는 목적 
		this.radius =r;
		//radius = radius;
		//this 는 변수를 구분하기 위해 사용한다.
	}
	public int getRadius() {
		return radius;// 멤버변수와 생성자가 가지고 있는 매게변수?
	}
	
	public CircleEX001(int radius,int a, int b) {// 어느 생성자 인지를 매게변수에 갯수를 가지고 구분
		radius = radius;
	}
	
	
	
	public CircleEX001() {
		this(10);//this가 가지고 있는건 클래스 명 똑같은 이름의 가로를 가지고 있다. 생성자
		// 생성자는 클래스 이름과 같다 this 도 클래스 명과 같다. 
		//위는 생성자 함수인데 생성자에서 다른 생성자를 호출할때 쓰이는 거 this
		
	}
	
}

public class This {
	public static void main(String[] args) {
		
		
		
	}

}
