package study;
import java.util.*;
public class D005IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �г��� �Է¹޾� 60�� �̻��̸� �հ�, �̸��̸� ���հ� �� 4�г��ΰ�� 70�� �̻��̾�� �հ�
		// �г��� 1-4�г� ���� �ִ�. ��ø if�� ó���ϱ�
		// ������ 65���̸� ,�г��� 4�г��̸� ���հ� ó�� �Ͻÿ�
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("������ �Է��ϼ���");
		a= sc.nextInt();
		System.out.println("�г��� �Է��ϼ���");
		b= sc.nextInt();
		
		if (a >= 60)/*60���̻��̸�*/ {
			if (b != 4)/*4�г��� �ƴϸ�*/ { 
				System.out.print("�հ�");
			}else if (b==4&& a >= 70)/*4�г��� 70���̻��̸� */ {
				System.out.print("�հ�");
			} else/*4�г��� 70���̸��̸� */ {
				System.out.println("���հ�");
			}
		}else/*����60���̸��̸� */
			System.out.println("���հ�");
		
		
	
		}	
	}		
