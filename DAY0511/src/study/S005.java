package study;
import java.util.*;
public class S005 {

	public static void main(String[] args) {
		/* ���� ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿���
		 * 3�� ������� ����ϴ� ���α׷��� �ۼ��ϼ���
		 * �迭�� ����ؼ� ��������
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		
		int bb []= new int[10];
		for(int i=0;i<10;i++) {
			bb[i]=sc.nextInt();
			
			if(bb[i]%3==0) {
				System.out.print("3�� �����"+bb[i]);
				
			}
			
		}
		/*�ڵ��� ���� �����ϼ���
		 * int [] arr = new int[10];
		 * for(int i=0;i<arr.length;i++){
		 * System.out.print((i+1)+"��° ��) "}
		 * arr[i]=sc.nextInt();
		 * 
		 * System.out.println();
		 * for(int )
		 * if(arr[i]%3==0)
		 * System.out.print(arr[i]+"")
		 * 
		 */
		

	}

}
