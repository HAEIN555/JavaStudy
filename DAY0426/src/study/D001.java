package study;
import java.io.*;
public class D001 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// �빮�ڸ� �Է¹޾��� ��� �ҹ��ڷ� ��ȯ�Ѵ�. �ҹ��ڷ� �Է¹޾������ �빮�ڷ� ��ȯ�Ѵ�.
		// 1. �Է°��� �빮�ڶ�� 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ĺ��� �Է��ϼ���");
		int n=br.read();
		char ch;
		if(n>=65&&n<=90) {
			n+=32;// n���� 32��ŭ ������Ŵ
			ch = (char)n;
			System.out.println(ch);
		}
		else if(n>=97&&n<=122) {// �Է°��� �ҹ��ڶ��
			n-=32;// n���� 32��ŭ ������Ŵ
			ch= (char)n;
			System.out.println(ch);
		}else {//�Է°��� ���ĺ��� �ƴ϶�� �Է¿��� ���
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");}
		}
	
	

}

