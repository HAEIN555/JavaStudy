package Com.method_;
/* �޼ҵ� ���� �� ���ϵ� ������ �ڷ����� '...'��� ��������� �̸� ����
 * �޼ҵ带 �����ϴµ� �ʿ��� ������ ���� ����(���������� �迭ȭ �۾��� �ڵ����� ����)�ϰ� ���� �� �� �ִ�.
 * 
 */
public class VariableEx {
	public void argsTest(String...n) { // ������ ���� ���� 
		for (int i=0;i<n.length;i++) {
			System.out.println("a["+i+"] :" +n[i]);
		}
	}
	public static void main(String[] args) {
		VariableEx ve= new VariableEx();
		ve.argsTest("a","b","c");
		ve.argsTest("100","1000","600","10000");
	}

}
