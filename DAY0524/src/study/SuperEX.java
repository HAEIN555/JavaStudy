package study;

class Super{// �θ� Ŭ���� 
	int a =5; // �θ� Ŭ������ ��� ���� 
	
	public Super(int x) {
		System.out.println("�θ�Ŭ���� ������ :"+x);
	}
	
}
class Sub extends Super{
	int a =10;
	public Sub() {
		super(5);
		System.out.println("�ڽ�Ŭ������ ������");
	}
	// �ڽİ� �θ� ������ �Ȱ���
	public void test() {
		System.out.println(this.a); //sub�� ����Ǿ��ִ� int a�� ���� ���´�.
		System.out.println(super.a); // Super�� ����Ǿ� �ִ� int a ���� ���ö�
		// �ڽİ� �θ��� ������ ������ ��Ÿ���� ��
	}
}


public class SuperEX {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.test();
	}

}
