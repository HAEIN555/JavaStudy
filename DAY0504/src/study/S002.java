package study;
import java.util.*;
public class S002 {
	public static void main(String[] args){
		/* -50���� 1������ ���� ����ϴ� ���α׷�
		 * ��, ���ٿ� 5������ ����ϰ� �� ���� ���̸� �ǰ������� ��켼��!
		 * while���� ����ϼ���
		 */
		/*
		 * int a; int c=1; a=-50; while(a<=1) { System.out.printf("%d%c",a,((c++%5!=0)?'
		 * ':'\n')); a++;}
		 */
		// �߸��Ѱ� �ý��� �ƿ��� while�� �ۿ��ٰ� ����Ѱ�..!
		/*if(i%5==0)System.out.printf("%d\t",i)
		 * i++;
		 * if(i%5==0)
		 * System.out.println();
		 */
		/*while���� �̿��ؼ� �ݶ� ���̴� ����ƾ ���ڼ��� ���̽� ���Ͻ��� ������
		 * ���Ǳ����α׷��� ���弼��
		 * �� 0���� �Է��ϸ� �����ϼ���
		 */
		Scanner sc= new Scanner(System.in);
		int u=-1;
		
		
		while(u !=0) {
			System.out.print("1.�ݶ�2.���̴�3.����ƾ4.���ڼ���5.���̽�6.���Ͻ�0.����");
			u=sc.nextInt();
			switch (u) {
			case 1:
				System.out.println("�ݶ�");
				break;
			case 2:
				System.out.println("���̴�");
				break;
			case 3:
				System.out.println("����ƾ");
				break;
			case 4:
				System.out.println("���ڼ���");
				break;
			case 5:
				System.out.println("���̽�");
				break;
			case 6:
				System.out.println("���Ͻ�");
				break;
			default:
				System.out.println("ã���ô� ��ǰ�� �����ϴ�.");
				break;
			}
		
		}
		
	}

}
