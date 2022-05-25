package study;

import java.io.*;

public class D003 {
	/*배열까지는 절차지향이다 위에서 아래로! 그 이후는 객체지향(밑에서 위로)모듈을 가져온다.
	 * switch case 문 위에서 아래로 내려가면서 조건식과 일치하는 case문으로 이동하고 
	 * 문장들을 수행한후 break문이나 switch문 전체를 빠져나간다
	 * 단축키 sw ctrl space 누르면 switch case문이 나옵니다.
	 */
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		// 두 정수와 연산자를 입력받아 계산하는 프로그램 구현 
		// switch~case 문으로 만드세요~!
		// TODO Auto-generated method stub
				// 임의의 두 정수와 연산자를 입력받아 산술연산 프로그램을 구현하시오
				// 단 산술연산자는 (+-*/) 모든 입력은 BufferedReader로 처리하시오
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int a,c,total = 0;
				System.out.print(" 정수하나를 입력하세요:");
				 a =Integer.parseInt(br.readLine());
				 System.out.print(" 연산자를 입력하세요:");
				 char v = (char)System.in.read();
				System.in.read();// \r   enter 키를 의미한다.
				System.in.read();// \n 줄바꿈을 의미한다.
				System.out.print(" 그다음정수를 입력하세요:");
				 c =Integer.parseInt(br.readLine());
				System.out.printf("%d %c %d =%d\n",a,v,c,(a+c));
				
		switch (v) {
		//char +-*/%
		case '+':
		total =a+c;	
			break;
		case '-':
		total =a-c;	
			break;	
		case '*':
		total =a*c;		
			break;	
		case '/':
		total=a/c;			
			break;	
		case '%':
		total=a%c;				
			break;
			
		default: 
		System.out.println("연산자 오류");
			break;
		}
	System.out.println();
	System.out.println(a+" "+v+" "+c+"="+total);
	
		
		
	}
}
