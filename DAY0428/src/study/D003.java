package study;
import java.util.*;
public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*����ڷκ��� ������ ������ �Է¹޾� 1���� �Է¹��� �������� ��ü�հ�
		 * ¦�� �հ�, Ȧ�� �հ踦 ���� ����ϴ� ���α׷��� �����ϰ� 10������ �հ踦 
		 * ����ϼ���!
		 * 1-10 /1-20/1-30
		 * 1����10���� ��ü �� 55
		 * 1���� 10���� ¦����
		 * 1���� 10���� Ȧ����
		 */
	Scanner sc = new Scanner(System.in);
	int a,i;
	int even,odd,sum;
	even=odd=sum=0;
	System.out.println("���ڸ� �Է��ϼ���");
	a=sc.nextInt();	
	for(i=1;i<=a;i++) {
		sum=sum+i;
		if(i%2==0) {even=even+i;}
		else if(i%2!=0) {odd=odd+i;}
		if((i%10==0)||(a==i)) {
		System.out.println("1����"+i+"������ �հ�"+sum);
		System.out.println("1����"+i+"������ ¦���հ�"+even);
		System.out.println("1����"+i+"������ Ȧ���հ�"+odd);}
	}
	
	}
}
