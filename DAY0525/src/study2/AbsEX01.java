package study2;

public abstract class AbsEX01 {
	
	int a = 10; // 변수 
	final String str ="abstract"; // final을 붙여줌으로써 상수화 시켜줌 // 상수 
	
	public String getStr() { // 일반 메소드 
		
		return str;
	}
	// 추상 메소드
	abstract public int getA();
	
	
}
