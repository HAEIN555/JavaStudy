package study;

/* ���� �ϳ� �Է¹��� �� ���
 *  - System.in.read() -48 or '0'
 */
import  java.io.IOException;
public class D003 {
	public static void main(String[] args) throws IOException {
		
		int num1;
		int num2;
		System.out.print("���� 1:");
		num1= System.in.read()-48;
		// �ϴ� �ƽ�Ű �ڵ� ���� �޴´� �׸��� 0�� ���� 48�� ���־ �ϳ��� ������ �����ϰ� �����.?
		// �ƽ�Ű �ڵ� ������ 48�� �������μ� ���� 0���� �����ϰ� �����.?
		//�� �ٸ� ���� �־��ٶ� enterŰ�� �־��־ �Է��� �����Ƿ� enter �� �ٹٲ� Ű�� �ʿ��ϴ�!
		System.in.read();// \r   enter Ű�� �ǹ��Ѵ�.
		System.in.read();// \n �ٹٲ��� �ǹ��Ѵ�.
		// enteró���� ���� ������ ���ڰ� �Էµ��� �ʴ´�. 
		System.out.print("���� 2:");
		num2= System.in.read()-48; 
	
		System.out.println(num1+","+num2);
		
		// ���ڸ� ���ڸ� �Է¹����� �ƽ�Ű �ڵ忡�� -48�� ���� ���ڸ����� ������ �޴´�.
		// 
		
	}
}
