package study;

class Car{
	String color;
	//private int speed; ��� �Ѵٸ� ������ �����ϴ� private �̶�� �Ѵ�. 
	// private�� ���ϱ� ���ؼ��� setter�� �̿��Ѵ�. 
	int speed;
	void upSpeed(int value) {
		speed =speed +value;
	}
	void downSpeed(int value) {
		speed =speed -value;
	}
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	// getter �� �����������ִ°� setter��....���� �����ϰų�����?
	
}
public class S003 {

	public static void main(String[] args) {
		
		Car car1 =new Car();
				//new ������ �Լ� Ŭ������ �ϳ��� �����Ѵ�. 
				// Ŭ������� �����ϴ� 
		car1.color="�����"; // car Ŭ���� �ɹ� ������ ���� �����Ѵ�. 
		car1.speed=0;
		// car Ŭ������ up speed(30)�޼ҵ忡 30�� �Ű� ������ ���� �����ߴ�. 
		car1.upSpeed(30);
		
		System.out.println(car1.getColor());// ���� ���Ѱ��� Ȱ���Ҷ� 
		System.out.println(car1.getSpeed());
		
	}
}
