package study;
import java.util.*;
public class D004IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 2���� �Է¹޾� ���긦 �غ���!
				// if ���� �����ڸ� ��Ƽ� 
				//�����ڸ� char�� �ƴ� String���� ��������! �ΰ��� ���
				// ù��°�� ���� sc.next();.charAt. �� ���� �ʰ� sc.next();�� ���� �Ŀ� 
				// ������ ǥ�ÿ� ���� ����ǥ ' �� �ƴ� "" ū����ǥ�� �Ἥ ǥ��
				// �״����� printfǥ�� �Ҷ����� %c�� �ƴ� %s�� ǥ�� 
		        // �ι�° ��� �����ϰ� sc.next();�� ǥ�������� if ������ if(s.equls("+"))�� ǥ��!
				//s.equls("+")	
				Scanner sc= new Scanner(System.in);
				int a,b;
				String op;
				System.out.print("ù��° ������ �Է��ϼ���");
				a= sc.nextInt();
				System.out.print("�����ڸ� �Է��ϼ���");
				op= sc.next();
						
				System.out.print("�ι�° ��° ������ �Է��ϼ���");
				b=sc.nextInt();
				// ����if ��  ������ if ������ �ִ�
				if (op=="+") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a+b));
				}else if(op=="-") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a-b));}
				else if(op=="*") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a*b));}
				else if(op=="/") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a/b));}
				else if(op=="%") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a%b));}
				else {System.out.println("�����ڰ� �ƴմϴ�");}
	}
}
