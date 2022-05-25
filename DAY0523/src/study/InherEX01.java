package study;
/* 상속시 주의 사항 
 * - 상위 상클래스에서 선언된 멤버 변수와 하위 클래스에서 선언된 멤버변수가 같으면 
 * 		상위 클래스의 멤버변수(클래스의 속성과 기능 그리고 이것은 변수와 매서드)가 무시 됩니다. 
 * 		이때 상위 클래스의 멤버변수를 사용하기 위해서는 super라는 키워드를 이용함 
 * 
 *  - 동일한 이름의 멤버변수나 동일한 이름의 메소드가 한 클래스 안에 정의 되는 경우에는 에러가 발생!
 *  	(중복되는거...?)
 *  
 */
// 부모 클래스 
class SuperTest {
	protected double area;
	private String title;// 전역변수 
	
	public SuperTest() {// 부모의 생성자 
		System.out.println("Super Test().. 인자가 없는 생성자");
	}
	public SuperTest(String title/*지역변수*/) {// 생성자 메소드 
		this.title=title; 
	}
	public void write() {
		System.out.println(title+" "+area);
	}
}
// 자식 클래스   상속관계! !
class Rect extends SuperTest{
	/*
	 * protected double area; public void write() {
	 * System.out.println(title+" "+area); }
	   상속받아서 들어와있는 것들*/
	
	private int w,h; // w - width h-height
	public Rect() {
		//super();
		// 를 통해서 부모를 호출  부모의 생성자를 이야기 한다면 super
		
	}
	
	//연산 메소드 구현
	public void calc(int w,int h) {
		this. w = w;
		this. h = h;
		area =(double) this.w*this.h;
		write();
	}
	
	
	@Override
	public void write() {
			System.out.println("w :"+w+"h :"+h);
			System.out.println("사각형의 넓이는 : "+area);
		// 매개변수와 메소드의 이름 반환형이 동일해야한다. 
		// TODO Auto-generated method stub
		//super.write(); // 부모가 가지고 오는 
	} // ctrl space눌러서  write메소드를 가지고 온다. 
	/* 메소드 오버 라이딩 
	 * 상위 (부모 ) 클래스를 상속 받은 하위 클래스에서 상위 클래스에 
	 * 정의 된 메소드를 재정의 하는 것을 의미한다.
	 * 객체지향 프로그램의 특징 - 다형성을 나타낸다
	 *  재정의란? 반드시 상속관계에 있어야하며, 메소드 이름 리턴타입,매개변수의 개수나 타입이
	 *  완전히 일치해야한다. 
	 */
}
class Circle extends SuperTest{
	
	public Circle(String title){
		super(title);
	}
	public void calc(int r) {
		area = r*r*3.141592;//protected double area; 부모에 이게 있어서 
		write(); // 부모의 것 
		
	}
}


public class InherEX01 {

	public static void main(String[] args) {
		Rect r = new Rect();// 부모의 생성자가 없다면 에러가 난다. 비어있는 기본생성자를 만들어주어야함!
		
		Circle c= new Circle("원의 넓이 : ");
		r.calc(10, 5);
		c.calc(30);
		
		
		
	}

}

/*
 * super
 * -	static으로 선언되지 않은 메소드에서 사용되며,
 * 		현재 클래스가 상속받은 하위클래스의 객체를 갖는다. 
 * 		
 * 		super는 상위 클래스의 생성자를 호출하거나
 * 		상위클래스의 멤버변수 또는 메소드를 호출할때 사용할 수 있다.
 * 		
 * 		하위 클래스는 생성자에서 상위 클래스의 생성자를 호출할때에는 
 * 		하위 클래스의 생성자 정의 구문에서 맨 처음에만 위치할 수 있다. 
 * 		this라고 하는 메소드와 동일하다...
 * 
 * 		생성자와 클래스의 상속간의 관계 
 * 		하위 클래스는 상위 클래스 맴버를 상속 받지만 
 * 		생성자는 상속되지 않는다. 
 * 		
 * 		하위 클래스의 생성자를 호출할때
 * 		자동적으로 상위 클래스의 생성자가 호출된다.
 * 		이때 상위 클래스의 생성자는 인수가 없는 생성자가 호출된다
 * 
 * 		상위 클래스 및 하위 클래스를 작성할때에 
 * 		생성자를 작성하지 않거나 인수가 없는 생성자만을 작성한 경우
 * 		명시적으로 하위클래스에서 상위 클래스 생성자를 호출하지 않아도 
 * 		아무런 문제가 발생하지 않지만 상위 클래스에 인자가 있는 생성자만 
 * 		존재하는 경우는 문제가 발생될 수 있다.
 * 
 * 		
 * */
	class A_class{
		
		public A_class(int n) {
			
		}
	}
	class B_class extends A_class{
		public B_class() {
		super(10);// 문제 발생 인자가 없는 생성자가 있어서 오류가 발생? A_class(10);
		// 선두자리에 상위클래스의 생성자를 호출 
		}
	}
	
	/*          상위 클래스           |                         하위 클래스                  |                   결과
	 * ==========================================================
	 *   생성자를 정의하지 않음     |                     생성자 정의 안함                |                 가능하다
	 *                                  |                      인수가 있는 생성자             |                  가능하다
	                                     |                      인수가 없는 생성자             |                  가능하다
	 ============================================================
	 	인수가 없는 생성자 정의      |               생성자 정의 안함                      |                 가능하다
	 	                                 |              인수가 없는 생성자                    |                  가능하다
	                                     |              인수가 있는 생성자                    |                  가능하다
	 ===========================================================
	      인수 있는 생성자만 정의    |                  생성자 정의 안함                 |                 에러가 발생
	                                      |                   인수가 없는 생성자             |            상위클래스의 해당생성자를 
	                                                            (기본생성자)                               호출하지 않으면 에러발생 
	                                                          인수가 있는 생성자             |    상위 클래스의 해당 생성자를 호출하지
	                                                                                                      않으면 에러가 발생                                                   
	 
	 
	 */
	
