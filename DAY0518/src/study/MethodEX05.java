package study;

import java.io.*;
public class MethodEX05 {
	public static String getString(String str)/*여길로 호출*/throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str +":");
		String imsi = br.readLine();
		
		return imsi;
	}
	
	public static void main(String[] args)throws IOException{
		String name =getString("이름");// 메소드 호출
		System.out.println(name+"님 안녕하세요");

	}

}