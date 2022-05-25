package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class D001 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// 삼항 연산자는 개발모드에서 자주 사용된다.  그러니까 잘 알아두기!
		// \b -back space라는 기능인데 이클립스에서 버그가 생겨서 네모로 나온다! 
		/* 숙제 풀이 
		 *  (알파벳이야???)_______:_________;
		 *                       >모음 과 자음 구별
		 *  char ch; // 문자를 저장할 변수 
		 *  String s=" ";
		 *  System.out.println("알파벳문자를 입력하세요");
		 *  ch =(char)System.in.read();
		 *  s =((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))?
		 *  (((ch=='a')||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A')||ch=='E'||ch=='I'||ch=='O'||ch=='U'))?
		 *  "모음":"자음")
		 *  :"알파벳이 아닙니다.;"                     
		 *  System.out.println(s);                       
		 */
		// 배열의 시작 index의 시작은 0부터..?
		// 배열 [ ] 행이 기준..? 배열에는 반복문이 필수!   [행][열]
		//
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));	
		System.out.println("알파벳문자를 입력하세요");	
		char a=(char)System.in.read();
		//삼항연산자 조건식 ?식1:식2;
		String result;
		result =(a>='a'&& a<='z') || (a>='A'&&a<='Z') ? 
				((a=='a'||a=='e'||a=='i'||a=='o'||a=='u')||(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')?"모음":"자음") : "알파벳아님";
		System.out.println(result);
	}
}
