package study2;

public class InnerEX {

	public static void main(String[] args) {
		// ���� Ŭ������ ��� ������ �����Ϸ��� ���� �ܺ�Ŭ������ ��ü�� ���� 
		OuterEX oe = new OuterEX();
		// �ܺ� Ŭ������ ���ؼ� ���� Ŭ������ ��ü�� ����
		OuterEX.InnerEX oi = oe.new InnerEX();
		
		System.out.println("oi.x : "+oi.x);

	}

}
