package study;
import java.io.*;
public class D001 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// 대문자를 입력받았을 경우 소문자로 변환한다. 소문자로 입력받았을경우 대문자로 변환한다.
		// 1. 입력값이 대문자라면 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("알파벳을 입력하세요");
		int n=br.read();
		char ch;
		if(n>=65&&n<=90) {
			n+=32;// n값을 32만큼 증가시킴
			ch = (char)n;
			System.out.println(ch);
		}
		else if(n>=97&&n<=122) {// 입력값이 소문자라면
			n-=32;// n값을 32만큼 증가시킴
			ch= (char)n;
			System.out.println(ch);
		}else {//입력값이 알파벳이 아니라면 입력오류 출력
			System.out.println("입력값이 잘못되었습니다.");}
		}
	
	

}

