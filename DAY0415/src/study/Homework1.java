package study;
	
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ������ �ִ�. ������ �̸��� ���� ���� ���� 
		// ���� 3������ ������ �Է� �޾� ����, ����� ����ϴ� ���α׷��� ������ 
		// �� ����� �Ҽ� 2�ڸ����� ����ϼ��� 
		// �Է��� ��ĳ�� 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���");
		int a =Integer.parseInt(sc.next());
		System.out.println("���������� �Է��ϼ���");
		int b = Integer.parseInt(sc.next());
		System.out.println("���������� �Է��ϼ���");
		int c = Integer.parseInt(sc.next());
		
		int total = a + b +c;
		System.out.println("������"+total);
		double average = total/3;
		System.out.printf("�����%.2f\n",average);
		
		sc.close();
		
	}

}
