package study;
/*if�� Ȱ���� �غ���
 */
import java.util.*;
public class D002IF {

	public static void main(String[] args) {
	// ��ĳ�ʸ� �޾Ƽ� ���� home work 2ó�� �� ������ �����ڸ� �Է¹޾ƺ��� 
		Scanner sc= new Scanner(System.in);
	/*int a,b;
	char op;
	System.out.print("ù��° ���� �Է�"); // ù��° ������ �Է� 12345
	a = sc.nextInt();
	
	System.out.print("������ �Է�"); // ������ �Է� +
	op= sc.next().charAt(0); 
			//sc.next();�� ���ڿ��̱⶧����  sc.next().�� ġ�� 
			//index ó�� ���ڸ� �����´ٴ� charAt(0)�����ش�.
			// ���� string���� ���ٸ� sc.next();�� ���ָ� �ȴ�. 
			//char�� ���� �ϳ��⶧���� charAt(0) -- ���� �ϳ��� �����´�!
	System.out.print("�ι�° ���� �Է�"); // �ι�° ���� �Է� 4567564
	b= sc.nextInt();
	*/
		
	// ������ �Է¹޾� Ȧ�� ���� ¦������ �����ϼ���~ if���� ����ϼ���~
		
		int v;
		
		System.out.println("ù��° ���� �Է�");
		v= sc.nextInt();
		if (v%2==0)
			{System.out.println("¦��");
			System.out.println("¦������");}
		// ���� Ȧ���� ���� �ִ´ٸ� "¦��"��� ������ ��µ��� �ʴ´�.
		// ����� ���ٸ� �ٷ� �ؿ��͸� �ν�	
		// �����ȿ� �ִ� �� ��  �ν�!!!!!
		
	}

}
