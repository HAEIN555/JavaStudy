package HW2;
public class RFMouse  extends Mouse  implements IRF {
	@Override
	public void wconnect() {// �������̽��� �޼ҵ带 ������ 
		System.out.println("���콺 ���� ����");
	}
	@Override
	public void wdisconnect() { // �������̽��� �޼ҵ带 ������ 
		System.out.println("���콺 ���� ���� ����");
	}
	@Override
	void move() { // �߻�Ŭ������ �޼ҵ带 ������ 
		System.out.println("���콺 ������");
	}
	@Override
	void scroll() {// �߻�Ŭ������ �޼ҵ带 ������ 
		System.out.println("���콺 ��ũ�� ���� ");
	}
	public static void main(String[] args) {
		RFMouse rfm = new RFMouse();
		System.out.println("������� : "+rfm.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
	}

}
