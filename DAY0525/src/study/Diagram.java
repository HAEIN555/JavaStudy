package study;

public abstract class Diagram {
	
	abstract void draw(); // 추상메소드 하나를 생성한다. 
	// 상속을해야지만 써먹을 수 있는데 private는 상속이 불가능하니까 사용하면 안된다.
	// static도 안된다. 객체 생성할 수 없어서 안된다. body 가 없으니까 구현이 안된다. 
	// 추상클래스간의 상속은 재정의 하지 않아도 된다?
	
}
