package Com.method_;

/* �޼ҵ� �����ε� 
 * ������ (�ϳ���)Ŭ�������� ���� �̸��� ���� �޼ҵ尡 ������ ���� �Ǵ� ���� �ǹ�
 * ~���� �̸��� �޼ҵ忡 ���ڰ�(�Ű�����)�ٸ� ���
 * ~ ���ڰ� �ٸ��ٴ� ���� ������ ������ �ٸ��ų�, ������ �ڷ����� �ٸ��ų� ,������ ���� �ǹ���
 * ���� �������� ����� ������ �����ϴ� �޼ҵ�� ��� �̸��� ���� ����� �ϰ����� �����ϱ� ����
 * 
 * ���� ������ ��ȯ�� �޼ҵ� ��(�ڷ��� ����,�ڷ��� ����.....)
 * 		���� ������(public)�� ��ȯ��(return)�� ��� ���� 
 * 		�޼ҵ��� �̸��� �ݵ�� ���ƾ� �Ѵ�. (�����ؾ��Ѵ�.)
 * 		�ڷ����̳� ������ ������ �ݵ�� �ٸ��� �ؾ��Ѵ�.
 */
public class OverloadingEX01 {
		
		public void intLength(int a) {
			String s =String.valueOf(a);// ���� �´��� �ƴ��� ������ ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ�Ѵ�.
			System.out.print("�Է��� ���� ���̴� :"+s.length());
			
		}

		public void floatLength(float a) {
			String s =String.valueOf(a);// ���� �´��� �ƴ��� ������ ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ�Ѵ�.
			System.out.print("�Է��� ���� ���̴� :"+s.length());
			
		}

		public void StringLength(String a) {
			String s =String.valueOf(a);// ���� �´��� �ƴ��� ������ ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ�Ѵ�.
			System.out.print("�Է��� ���� ���̴� :"+s.length());
			
		}

		
	public static void main(String[] args) {
		OverloadingEX01 oe1= new OverloadingEX01();
		oe1.intLength(1000);
		oe1.floatLength(314f);
		
	}

}
