package study;

public class RoadBike extends AbstractBicycle {

	public static void main(String[] args) {
		
		RoadBike rb = new RoadBike();
		rb.id=300;
		rb.brand="ROBERT";
		rb.prtInfo();
		/* �׷� ��������� 
		 * ID :300
			Brand :ROBERT
			�� ���´�.
		 */

	}

	// ������ �ϴ� �� ������ �ȵǼ�  
	@Override
	void prtInfo() {
		System.out.println("ID :"+id);
		System.out.println("Brand :"+brand);
		
	}

}
