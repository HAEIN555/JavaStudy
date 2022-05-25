package study;

public abstract class AbstractBicycle { // 추상클래스

	// 멤버변수 
	int id;
	String brand ;
	
	// 추상 메소드 선언(반드시 하나는 선언되어야 함)
	abstract void prtInfo();
	
	// 일반 메소드 구현 
	public String getBrand() {
		return brand;
	}
}
