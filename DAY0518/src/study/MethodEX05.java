package study;

import java.io.*;
public class MethodEX05 {
	public static String getString(String str)/*����� ȣ��*/throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str +":");
		String imsi = br.readLine();
		
		return imsi;
	}
	
	public static void main(String[] args)throws IOException{
		String name =getString("�̸�");// �޼ҵ� ȣ��
		System.out.println(name+"�� �ȳ��ϼ���");

	}

}