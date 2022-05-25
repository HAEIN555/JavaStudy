package study;

public class RoadBike extends AbstractBicycle {

	public static void main(String[] args) {
		
		RoadBike rb = new RoadBike();
		rb.id=300;
		rb.brand="ROBERT";
		rb.prtInfo();
		/* 그럼 결과값으로 
		 * ID :300
			Brand :ROBERT
			가 나온다.
		 */

	}

	// 재정의 하는 것 구현이 안되서  
	@Override
	void prtInfo() {
		System.out.println("ID :"+id);
		System.out.println("Brand :"+brand);
		
	}

}
