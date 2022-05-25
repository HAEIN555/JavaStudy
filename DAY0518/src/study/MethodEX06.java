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
		//int kor = 30; 메소드로 처리하겠다 
		int kor = getInt("국어점수");
		System.out.println("당신의 국어 점수는"+kor+"입니다");
	}

}
