package study;
import java.io.*;
public class Homework0422 {
   /*임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램을 구현
    * 자음이면 자음이라고 출력 모음이면 모음이라고 출력
    * 단 대소문자 모두 적용하고 문자가 입력되면 오류라고 처리하세요
    */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
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
