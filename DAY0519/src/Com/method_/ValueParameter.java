package Com.method_;
/* ���� ���� ȣ�� (call by value)
 * �޼ҵ� ȣ��� �⺻ �ڷ����� ���� ����(�Ű�����)�� �����ϴ� ���
 * 
 */
public class ValueParameter {
	
	public int increase(int n) {
		++n;
		return n;
		
	}

	public static void main(String[] args) {
		int value = 100;
		
		ValueParameter vp = new ValueParameter();
		 vp.increase(value);//101
		// �⺻ �ڷ����� ���ؼ� �Ѿ�°� 
		 int value2=vp.increase(value);//�޼ҵ� ȣ��� �⺻�ڷ����� ���ڰ����� �����Ѵ�. 
		 System.out.println("value"+value+"value"+value2);
		 //value100value101
	}

}
