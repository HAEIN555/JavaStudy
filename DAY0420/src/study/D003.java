package study;

import java.util.Scanner;

public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 2 ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ ¦������ Ȧ �� ���� �����ϴ� ���α׷���
	    // �ۼ��ϼ���. �� , ���� ���� �����ڸ� �̿��Ͽ� ó���ϼ���~!
			Scanner sc= new Scanner(System.in);	
			int i;// ����ڷκ��� �Է¹޴� ����
			String s;// Ȧ������ ¦������ �Ǻ��ϴ� ����
			// �ȳ��޼��� �� �Է¹��� ���� ����
			System.out.println("������ �Է��ϼ���");
			i= sc.nextInt(); // �Է��� �� �ְԲ� ��ȯ
			s=i %2 ==0 ?  "¦��":"Ȧ��" ;
			System.out.println(s);
		// �������� if�� ��ȯ�غ���
			if (i%2==0)
				s="¦��";
			else
				s="Ȧ��";
			System.out.println("����� �Է��ϴ� ������"+s+"�Դϴ�");
			
			
	}
	

}
