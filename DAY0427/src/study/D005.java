package study;
import java.util.*;
public class D005 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���� �Ǽ��� �Է¹޾� �Է¹��� ���� ����� ���ϴ� ���α׷��� ����
			�� ���� �Ǽ��� �ԷµǸ� ��� �ϼ���
			���� �Ǽ� 1.1
			���� �Ǽ� 2.2
			���� �Ǽ� 3.3
			���� �Ǽ� 4.4
			���� �Ǽ� -5.5
			���ݱ����� ���2.2
			�Ǽ��� float���� ��������! next float*/
				Scanner sc = new Scanner(System.in);
				float total, input ;
				total = input = 0.0f; // �ʱⰪ�� ������ �ڷ����϶� ��ó�� �����ϰ� Ȱ���ص� �ȴ� !
				
				int count = 0 ;
				for(;input>=0.0;) {
					total = total + input ;
					System.out.println("���� �Ǽ� �Է�:");
					input = sc.nextFloat();
					count++;
				}
				System.out.println("���ݱ����� ���:"+total/count);}

		
	
	
	
	
	
	
	/*2�� for�� ��ǥ���� ���� �������̴�! 
	 * 
	 */
	}


