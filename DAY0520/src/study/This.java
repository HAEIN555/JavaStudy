package study;
/* this : ��ü �ڽ��� ����Ű�� ���۷��� (����)
 *  this�� �����Ϸ��� ���� �ڵ����� �����̹Ƿ� �����ڴ� this�� ����ϱ⸸ �ϸ� ��
 *   �����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ��� ù��° �ٿ� �;��Ѵ�. 
 *   �޼ҵ��� ���� ���ٿ� 
 *   this��� �޼ҵ�� �ٸ� �޼ҵ带 �ҷ��ö� ����Ѵ�. 
 */
class CircleEX001{

	int radius;// �������� 
	public CircleEX001(int r/*��������*/) {// �� ��ü�� �޼ҵ� �����ڵ� �޼ҵ�� ��ü�� �����ϴ� �޼ҵ� 
		// Ŭ������ �ʱ�ȭ �ϴ� ���� 
		this.radius =r;
		//radius = radius;
		//this �� ������ �����ϱ� ���� ����Ѵ�.
	}
	public int getRadius() {
		return radius;// ��������� �����ڰ� ������ �ִ� �ŰԺ���?
	}
	
	public CircleEX001(int radius,int a, int b) {// ��� ������ ������ �ŰԺ����� ������ ������ ����
		radius = radius;
	}
	
	
	
	public CircleEX001() {
		this(10);//this�� ������ �ִ°� Ŭ���� �� �Ȱ��� �̸��� ���θ� ������ �ִ�. ������
		// �����ڴ� Ŭ���� �̸��� ���� this �� Ŭ���� ��� ����. 
		//���� ������ �Լ��ε� �����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ� ���̴� �� this
		
	}
	
}

public class This {
	public static void main(String[] args) {
		
		
		
	}

}
