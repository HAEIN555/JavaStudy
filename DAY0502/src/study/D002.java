package study;
import java.io.InputStream;
import java.util.*;
public class D002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭���� ����(ũ�Ⱑ �������ֵ�.),������ �迭(����� �迭..?���� ���������� ���� ���������ʾҴ�!�ٸ����ΰ����迭)�� �ִ�!
		// �����ð��� �迭���ϱ� �����ϱ�! 
		/*while�� ����!
		 * ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ������.
		 * ���࿡ 0�� �ԷµǸ� ���ݱ���  �Էµ� ������ �հ踦 ����ϰ� ���� �ϴ� ���α׷��� �����ϼ���!
		 */
		
	Scanner sc= new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int a=0;
		int b=0;
		while(a>=0){
			b=a+b;
			a++;
		    a=sc.nextInt();
			if(a==0) {break;}
		}
	System.out.println(b);
	
	int n =1, sum=0;
	while(true) {
		if(n==0) {break;}
		System.out.print("�����Է�(0�̸� ����)");
		n=sc.nextInt();
		sum=n+sum;
		
	}System.out.println("���ݱ����� �հ�"+sum);
	
	
	
	
	
	
	
	
	
	}

	
}
