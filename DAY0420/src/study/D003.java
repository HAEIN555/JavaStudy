package study;

import java.util.Scanner;

public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 2 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 짝수인지 홀 수 인지 판정하는 프로그램을
	    // 작성하세요. 단 , 조건 삼항 연산자를 이용하여 처리하세요~!
			Scanner sc= new Scanner(System.in);	
			int i;// 사용자로부터 입력받는 변수
			String s;// 홀수인지 짝수인지 판별하는 변수
			// 안내메세지 및 입력받은 정수 저장
			System.out.println("정수를 입력하세요");
			i= sc.nextInt(); // 입력할 수 있게끔 변환
			s=i %2 ==0 ?  "짝수":"홀수" ;
			System.out.println(s);
		// 위문제를 if로 변환해보자
			if (i%2==0)
				s="짝수";
			else
				s="홀수";
			System.out.println("당신이 입력하는 정수는"+s+"입니다");
			
			
	}
	

}
