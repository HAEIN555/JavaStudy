package study3;
/*���� �ڵ����� Ŭ������ �ۼ��غ��� �ڵ����� 100% ���� ���͸��� �����Ѵ�. 
 * �ڵ����� �����Ҷ����� 1km�� �����ϰ� ���͸��� 10%�� �Ҹ��Ѵ�. ���� �ڵ�������
 * 2���� ������ �����ִ� ���÷��̰� �ִ�. ������ �ѰŸ��� ����Ÿ� ..:km ,���� ���͸� �������� ���͸� 
 *  �� %���� ǥ�õȴ�. 
 *  Ecar.getInstance() : ���ο� �ڵ����� �����ϴ� ���� �޼ҵ� ���ο� ���� �ڵ��� �ν��Ͻ��� ��ȯ�Ѵ�.
 * 		Ecar car =Ecar.getInstance();
 * dispDistance(); ---> ����Ÿ��� ǥ���Ѵ�.
 * dispBattery();  ----> ���� ���͸��� ǥ���Ѵ�. 
 * drive(); ---> �ѹ� ȣ�� �ɶ����� 1km�� �����Ѵ�. 
 *  */


public class Ecar {

	private int batteryPercentage =100;
	private int distance =0;//����Ǹ� �ȵǴϱ� private���� �Ѵ� ���������� �Ϸ��� 
	
	
	
	public static Ecar getInstance() {
		// ��ü ��ȯ
		return new Ecar();// car�� return �ص� �� 
	}
	public void dispDistance () {
		System.out.println(distance+"ų�ι��� ����..");
	}
	public void dispBattery () {
		if(this.batteryPercentage==0) {
			System.out.println("���͸��� ���� �����ϴ�. �����ϼ���");
			return;
		}
		System.out.println("Battery :"+batteryPercentage);
	}
	public void drive () {
		if(this.batteryPercentage!=0) {
			this.distance +=1;
			this.batteryPercentage -=10;
		}
	}
	
	
	public static void main(String[] args) {
		
		//Ecar car = new Ecar();
		Ecar car =Ecar.getInstance();
		car.drive();
		car.drive();
		car.drive();
		
		car.dispDistance();
		car.dispBattery();
	}

}
