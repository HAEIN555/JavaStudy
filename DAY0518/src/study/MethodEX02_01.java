package study;

public class MethodEX02_01 {
	public static void X() { // ���������� ����...? �޼ҵ带 ������ش�?
		for(int a=0;a<5;a++) {
			System.out.print("*");
		}//void�� return�� ����// ����� return ���� void�� ��� return���� ���� �����ϴ�. 
		return;
	}
	
	public static void main(String[] args) {
		// *�� ��� ���ؼ� �޼ҵ� ȣ���� �Ѵ�. 
		X();// ��� ���� ���� ������ ���� �޼ҵ带 �ҷ����� ȣ���ϸ� �ȴ�
		System.out.println("\nHello");
		X();
		System.out.println("\nJAVA");
		X();
		System.out.println("\n!!!!!");
		X();
		// �޼ҵ带 ����ؼ� ����ٸ� �ڵ尡 ����� ����������! 
		//����� ����� ���� ��������� �ٿ�����ϴ� �� 
		// �ڵ忡 ���� �ߺ��� �Ͼ�� ���� �ٿ��ִ� ȿ��! ������������
		// �ν��Ͻ� �޼ҵ� ��ü�� �����ؾ����� ����� �� �ִ� �޼ҵ� 
		// �������� �ּҰ�
		// ��������  = �迭 , Ŭ���� , 
		// �޼ҵ尡 ���� �Ѱ��ٶ� 2���� ��� �������� �Ѱ��ִ� �� ���� �Ѱ��ٶ��� call by value
		// �������� �ҷ����� �� call by reference?????????
		// å 277 �� ���� ���� 
		
}	
}
