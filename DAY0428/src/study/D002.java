package study;

import java.io.*;
public class D002 {
	/* ���Ѵ�� �ΰ��� ������ �Է¹޾� �հ踦 ���ϴ� ���α׷��� �ۼ��ϼ���!
	 * ���Ѵ��...?
	 * ����  ù��°�� n1,�ι�°�� n2
	 */
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int sum=0;
	for(;;) {
		System.out.println("�����Է�");
		int n1=Integer.parseInt(br.readLine());
		if(n1==0)
			break;
		int n2=Integer.parseInt(br.readLine());
		System.out.println("�μ��� �հ�"+(n1+n2));
	}
	// ���� ����
	while(true) {
		System.out.println("�����Է�");
		int n1=Integer.parseInt(br.readLine());
		if(n1==0)
			break;
		int n2=Integer.parseInt(br.readLine());
		System.out.println("�μ��� �հ�"+(n1+n2));
	}
		
		
		
		
		
		
		
		
		
		
		
	}
}
