package study;
import java.util.*;
public class S007 {

	public static void main(String[] args) {
		/* ��ǻ�Ϳ� ���� ������ �������� �� ������ �����. 
		 * ����ڰ� ���� 3������ �ϳ��� �Է��ϰ� �����Ѵ�.
		 * ��ǻ�ʹ� �������� �ϳ��� �����Ͽ� ����ڿ� ����
		 * ���� �̰������ �Ǵ��ϰ� ����ڰ� �׸��� �Է��ϸ� ������
		 * �����Ѵ�.
		 * 
		 * ���������� : ����
		 * ����ڰ� ���� ,��ǻ�Ͱ� ������ ����ڰ� �̱�
		 * ���������� : �׸�
		 * ������ �����մϴ�.
		 * ���ڿ� �迭 ����
		 * Stirng [] str = {"����","����","��"};
		 * ��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ��� 
		 * int n = (int)(Math.random()*3);
		 * 
		 * ��ǻ�Ͱ� �� ���� �������� �� 
		 * if(str[n].equals("����"))
		 */
		Scanner sc= new Scanner(System.in);
		 String [] str = {"����","����","��"};
		 while(true) {
			 System.out.println("����,����,�� �߿� �Է��ϼ���");
				String user =sc.next();
				 int n = (int)(Math.random()*3);
				 if(user.equals("�׸�")) {break;}
				 if(user.equals(str[n])) {System.out.println("�����ϴ�");}
				 if((str[n].equals("����"))&&(user.equals("����"))) {System.out.println("��ǻ�Ͱ� �̰���ϴ�.");}
				 if((str[n].equals("��"))&&(user.equals("����"))) {System.out.println("��ǻ�Ͱ� �̰���ϴ�.");}
				 if((str[n].equals("����")) &&(user.equals("��"))){System.out.println("��ǻ�Ͱ� �̰���ϴ�.");}
				 if((str[n].equals("��"))&&(user.equals("����"))) {System.out.println("����ڰ� �̰���ϴ�.");}
				 if((str[n].equals("����")) &&(user.equals("����"))) {System.out.println("����ڰ� �̰���ϴ�.");}
				 if((str[n].equals("�ָ�"))&&(user.equals("��"))) {System.out.println("����ڰ� �̰���ϴ�.");}
				
				 
				
				
			 
		 }
		 
	}

}
