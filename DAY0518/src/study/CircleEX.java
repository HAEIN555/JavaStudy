package study;

public class CircleEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza; // ���۷��� ���� ���� 
		
		pizza = new Circle(); // ��ü ����
		
		//Circle pizza = new Circle();�̷��� �ϳ��ε� ǥ�� ����
		
		pizza.radius=10;// ������ �������� 10���� ���� 
		pizza.name ="�ڹ�����";
		
		// ���� ũ�� ���ϱ�(����)
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������"+area);
		
		
		Circle donut = new Circle();
		
		donut.radius=2;// ������ �������� 2�� ����
		donut.name="ȣ�Ӱ����� �����ϴµ���";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������"+area);
		
		
	}

}