package study;
import java.util.*;
public class D004 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�Է¹��� ������ ����� ���ϴ� ���α׷��� �ۼ��ϼ���
		 * ���ϸ��� �Է��� ������ ������ ����ڷ� ���� �Է¹޴´�.
		 * �Է¹��� �� ��ŭ ��հ��� ���Ͽ� ����Ѵ�.
		 * ��հ��� �Ǽ��� ó���Ѵ�.
		 */
	Scanner sc=new Scanner(System.in);
	int num1,num2,m;
	int sum=0;
	double avg=0;
	System.out.println("������ �Է��ϼ���");
	num1=sc.nextInt();
	
	for(m=1;m<=num1;m++) {
		System.out.println("������ �Է��ϼ���");
		num2=sc.nextInt();
		sum=sum+num2;
	}
	avg=(double)sum/num1;
	System.out.printf("�Է��� ������ ���:%.2f\n",avg);
	}
}
