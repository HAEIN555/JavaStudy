package study;
import java.util.*;
public class S008 {
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
		 String [] com = {"����","����","��"};
		 // ���� ���� �� ���ڿ��� ������ �迭
		 System.out.println("��ǻ�Ϳ� ���������� ������ �����մϴ�.");
		 while(true) {
			 System.out.println("����,����,�� �߿� �Է��ϼ���");
			 	String a =sc.next();
				if(a.equals("�׸�")) {
					System.out.println("������ �����մϴ�.");
					break;}
				// ��ǻ�Ͱ� ���� ���� �� ���� �������� �����Ѵ�.
				int n = (int)(Math.random()*3);
				// 0.1.2 �߿��� ������ ������ �����Ѵ�. 
				String b= com[n];
			 System.out.println("����ڴ� "+a+"��ǻ�ʹ� :"+b);
			 //����ڰ� ������ ���
			 if(a.equals("����")) {
				 if(b.equals("����")) {System.out.println("�����ϴ�.");}
				 else if(b.equals("����")) {System.out.println("��ǻ�Ͱ� �̰���ϴ�.");}
				 else {System.out.println("����ڰ� �̰���ϴ�.");}
			 }
			 // ����ڰ� ������ ���
			 else if(a.equals("����")) {
				 if(b.equals("����")) {System.out.println("�����ϴ�.");}
				 else if(b.equals("���ڱ�")) {System.out.println("��ǻ�Ͱ� �̰���ϴ�.");}
				 else {System.out.println("����ڰ� �̰���ϴ�.");}
				 
			 }
			 // ����ڰ� ���ڱ��� ���
			 else if(a.equals("���ڱ�")) {
				 if(b.equals("���ڱ�")) {System.out.println("�����ϴ�.");}
				 else if(b.equals("����")) {System.out.println("��ǻ�Ͱ� �̰���ϴ�.");}
				 else {System.out.println("����ڰ� �̰���ϴ�.");} 
			 }
			 // ������ ������ ���ڱⰡ �ƴѰ��
			 else {System.out.println("�ٽ� �Է��ϼ���");}
		 }
		 

	}

}
