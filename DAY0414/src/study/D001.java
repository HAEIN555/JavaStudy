package study;

	import java.util.*;

public class D001 {
	public static void main(String[] args) {
		
		// char �� 2����Ʈ�̰� 
		// '' Ȭ����ǥ �̱� ���͸� ����Ѵ�.
		// �ƽ�Ű �ڵ�� 1����Ʈ ���ڸ� ǥ�� 0-255 ���� ���� ���� ǥ�� 
		// �����ڵ�� 2����Ʈ ���ڸ� ǥ�� 0-65535 ���� ���� ���� ǥ��
		
		char ch1 = 'A';
		char ch2 = '\u0041'; // �����ڵ�� �������� ǥ�� ���� �����ڵ�� 2byte
		//2byte �� 16�����̴�.  �� 16������ 10������ �ٲٸ� 4*16^1+1*16^0
		//���� 65�̰� �̰��� �빮��  A�� ��Ÿ����.
		System.out.println((int)ch1); //(int) �� ����ϸ� ���������� �ٲپ� �ش�. 
		System.out.println((int)ch2); 
		System.out.println((char)(ch1+ch2));// (char) �� ����ϸ� ���������� ��Ÿ���ش�.
		// (char)(ch1+ch2)) �̷��� ���� �ؾ� �Ѵ�.  ���İ����ž�!
		
		//0�� �ƽ�Ű�ڵ�δ� 48�̴�?
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���� �Է�");
		String str = sc.next();
		System.out.println(str);
		
		
	
	}
}
