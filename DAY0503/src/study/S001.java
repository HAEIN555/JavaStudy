package study;
import java.util.*;
public class S001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*����ڷκ��� �ϳ��� ���ڸ� �Է¹��� ����, �� ����ŭ 3�� ����� ����ϴ� ���α׷��� �ۼ�
		 * ���� ����ڷ� ���� 5�� �Է¹޾Ҵٸ� 3.6.9.12.15�� ������ ���弼��!
		 */
	Scanner sc= new Scanner(System.in);
	System.out.println("���ڸ� �Է��ϼ���");
	int j=sc.nextInt();//������ �Է¹޴°�
	int i = 1;
		while(i<=j) {
			System.out.print(i*3+"\t");
			i++;
		}System.out.println();
	}

}
