package study;
import java.io.*;

public class D004 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 양수인지 음수인지 0인지를
		 * 판정하는 프로그램 구현하세요
		 * 입력은 bufferedReader 사용하고 if나 삼항연산자 사용하세요
		 * 중첩 if 사용하세요
		 */
		//s= (a<0)?"음수":((a==0)?"영" : "양수");
		/*
		 * 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지 판정하는 프로그램을 구현하세요
		 * 입력은 if나 삼항연산자를 사용하고
		 * 윤년 판정의 조건 -년도가 4의 배수이면서 100의 배수가 아니거나
		 * 400의 배수이면 윤년 그렇지 않으면 평년
		 * if문 사용하세요
		 */
		/*
		 * int year;
		 * String s; 
		 * System.out.print("년도 입력");
		 * year = Integer.parseInt(br.readLine());
		 * s= ((year%4==0)&&(year%100!=0)||(year%400==0))?"윤년":평년";
		 *  System.out.println(year + "==>"+s);
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		
		System.out.println("임의의 정수를 입력하세요");
		a =Integer.parseInt(br.readLine());
		if (a<=0){ 
			if(a==0)System.out.println("0");
			else System.out.println("음수");
		}
		else  System.out.println("양수");
		
		System.out.println("임의의 년도를 입력하세요");
		int r=Integer.parseInt(br.readLine());
		if (r%4==0 && r%100 != 0 ||r%400==0){System.out.println("윤년");}
		else {System.out.println("평년");}
		
		
		
		
		
	}
}
