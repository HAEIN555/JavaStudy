package study;
import java.io.*;
public class Homework2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ������ �� ������ �����ڸ� �Է¹޾� ������� ���α׷��� �����Ͻÿ�
		// �� ��������ڴ� (+-*/) ��� �Է��� BufferedReader�� ó���Ͻÿ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,c;
		System.out.print(" �����ϳ��� �Է��ϼ���:");
		 a =Integer.parseInt(br.readLine());
		 System.out.print(" �����ڸ� �Է��ϼ���:");
		 char v = (char)System.in.read();
		System.in.read();// \r   enter Ű�� �ǹ��Ѵ�.
		System.in.read();// \n �ٹٲ��� �ǹ��Ѵ�.
		System.out.print(" �״��������� �Է��ϼ���:");
		 c =Integer.parseInt(br.readLine());
		System.out.printf("%d %c %d =%d\n",a,v,c,(a+c));
		
		
	}

}
