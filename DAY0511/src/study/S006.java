package study;
import java.util.*;
public class S006 {
	public static void main(String[] args) {
		/* Ű����� ���� �׼��� �Է¹޾Ƽ� �������� ������  õ���� 500��¥�� ����
		 * 100��¥�� ���� 50��¥�� ���� 10��¥�� ���� 1��¥�� �������� ��ȯ�ϴ� ���α׷��� ���弼��
		 *  �� �迭�� �ݸ��� �̿��ϼ���
		 *  �迭���� : unit
		 *  �ݾ� : 65123
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int money = sc.nextInt();
		
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
		for(int i=0;i<unit.length;i++) {
			// ���� ���� ���
			int res = money/unit[i];
			// res�� ���� �ִ°��� 
			if (res>0) {
				System.out.println(unit[i]+"��¥��"+res+"��");
				money =money%unit[i];// money ���� 
			}
					
		
		}
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int a= sc.nextInt();
		int ohman,man,chun,ohbak,bak,ohship,ship,il,b;
		ohman=a/50000;
		b=a%50000;
		man=b/10000;
		b=b%10000;
		chun=b/1000;
		b=b%1000;
		ohbak=b/500;
		b=b%500;
		bak=b/100;
		b=b%100;
		ohship=b/50;
		b=b%50;
		ship=b/10;
		b=b%10;
		il=b/1;
		
		System.out.println
		(ohman+","+man+","+chun+","+ohbak+","+bak+","+ohship+","+ship+","+il);
		
		
		 * 
		 */
	}

}
