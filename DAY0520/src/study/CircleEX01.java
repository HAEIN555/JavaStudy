package study;

public class CircleEX01 {

	public static void main(String[] args) {
		Circle c = new Circle(10, "��");//��ü�� ��������鼭 �ʱ�ȭ 
		//��¹� �ʿ��ѵ� ��ü�� ������ ����.
		System.out.println("���� ��������"+" "+c.radius+"�̰� �̸��� "+c.name+"�̴�.");
		System.out.println("���� ���̴�"+c.getArea()+"�Դϴ�");
	}

}