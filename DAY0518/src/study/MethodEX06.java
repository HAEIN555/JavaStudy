package study;

import java.io.*;

public class MethodEX06 {
	
	public static int getInt(String str)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(str+":");
		int imsi =Integer.parseInt(br.readLine());
		return imsi;
	} 

	public static void main(String[] args)throws IOException {
		MethodEX06 me =new MethodEX06();
		//int kor = 30; �޼ҵ�� ó���ϰڴ� 
		int kor = getInt("��������");
		System.out.println("����� ���� ������"+kor+"�Դϴ�");
	}

}
