package study;
import java.util.*;
public class S002 {

	public static void main(String[] args) {
		/* ������ ���ڰ� ����ִ� �迭�� ���� �����͵� �� 
		 * ¦���� ��Ҹ� ����ϰ� 3�� ����� ��Ҹ� ��� ����ϴ� 
		 * ���α׷��� ���弼��
		 * 
		 * ���� ���� : 4.7.9.1.3.2.5.6.8
		 * 
		 * 1.�迭�� ��ü ��� ��� : 4.7.9.1.3.2.5.6.8
		 * 2. ¦���� ���  : 4.2.6.8
		 * 3. 3�� ����� ��� :9.3.6
		 * 
		 */
		Scanner sc= new Scanner(System.in);
		int ant[]= {4,7,9,1,3,2,5,6,8};
		
		/*for (int i =0;i <9;i++ ) {
			System.out.println("������ �Է��ϼ���");
			ant [i]=sc.nextInt();}*/
		for (int i=0;i<9;i++) {
			System.out.printf("%4d,",ant[i]);
		}
		for (int i=0;i<ant.length;i++) {
			System.out.printf("%d,",ant[i]);
		}
		for (int temp :ant) {
			System.out.printf("%d,",temp);
		}
		System.out.println();
		
		System.out.println("¦�� ���");
		for (int i=0;i<ant.length;i++) {
			if(ant[i]%2==0)
			System.out.printf("%4d,",ant[i]);
		}
		System.out.println();
		System.out.println("3��� ���");
		for (int i=0;i<ant.length;i++) {
			if(ant[i]%3==0)
			System.out.printf("%4d,",ant[i]);
		}
			
		
		
	}

}
