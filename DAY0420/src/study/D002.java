package study;

import java.util.Scanner;

public class D002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//���� ���� ����!!!!!!!!! ���� Ǯ��
		Scanner sc= new Scanner(System.in);
		int Kor,Eng,Mat,Sci,His,Sum,Avg;
		char P;
		System.out.println("���������� �Է��ϼ���");
		Kor= sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		Eng= sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		Mat= sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		Sci= sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		His= sc.nextInt();
		Sum = Kor+Eng+Mat+Sci+His;
		System.out.print("��������"+Sum+"�Դϴ�");
		Avg = Sum/5;
		System.out.println("�����"+Avg+"�Դϴ�");
		if (Avg>=90) {P='A';}
		else if (Avg>=80){P='B';}
		else if (Avg>=70){P='C';}
		else if (Avg>=60){P='D';}
		else {P='F';}
		System.out.println("����� ������"+P+"�Դϴ�");
		*/
	// ���� 2 ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ ¦������ Ȧ �� ���� �����ϴ� ���α׷���
    // �ۼ��ϼ���. �� , ���� ���� �����ڸ� �̿��Ͽ� ó���ϼ���~!
		Scanner sc= new Scanner(System.in);	
		int a;
		String b,c,d;
		c="¦��";
		d="Ȧ��";
		System.out.println("������ �Է��ϼ���");
		a= sc.nextInt();
		b =a %2 ==0 ? c :d ;
		System.out.println(b);
		
		
		
		
		
		
	}

}
