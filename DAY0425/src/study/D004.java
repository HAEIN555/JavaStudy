package study;
import java.util.*;
public class D004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⵵�� ������ �Է¹޾Ƽ� ����� ����� ���ϼ���!
		/* ���� 1������ 4�� ������ �������� �ش� �������� �Ѵ�. ���߿��� 100���� �������� �ش� ������� �� 
		 *  �ٸ� 400���� ������ ���� �ش� �ٽ� �������� �Ѵ�. 
		 *  1���� ��ճ�¥�� 365.2425�Ϸ� ���Ͽ� �� 
		 *  ���� 1�⺸�� 0.0003���� ���. 
		 *  ù��°�� �⵵�� ���� ���� �ϰ� �ι�°�� ���� ������ ��¥�� �ؼ� ���� 
		 *  ������ ��¥�� 31��30��28���̸� ������� ����
		 *  �״��� ������� �������������� 2���� 29���̸� ���� 
		 */
		Scanner sc= new Scanner(System.in);
		int year,month,day;
		System.out.println("�⵵�� �Է��ϼ���!");
		year = sc.nextInt();
		System.out.println("���� �Է��ϼ���!");
		month =sc.nextInt();
		System.out.println("���� �Է��ϼ���!");
		day =sc.nextInt();
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:day=31;break;
		case 4:case 6: case 9: case 11:day=30;break;
		case 2:
			if((year%4==0)&&(year%100!=0)||(year%400==0))
				day=29;
			else
				day=28;
			break;
		default : day=0;break;
		}
		if(day!=0) {System.out.println(year+"��"+month+"����"+ day+"�����Դϴ�.");}
		else { System.out.println("�Է¿���");}
		
		}
	}

