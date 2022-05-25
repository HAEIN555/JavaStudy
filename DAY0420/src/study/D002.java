package study;

import java.util.Scanner;

public class D002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//학점 내기 문제!!!!!!!!! 문제 풀이
		Scanner sc= new Scanner(System.in);
		int Kor,Eng,Mat,Sci,His,Sum,Avg;
		char P;
		System.out.println("국어점수을 입력하세요");
		Kor= sc.nextInt();
		System.out.println("영어점수을 입력하세요");
		Eng= sc.nextInt();
		System.out.println("수학점수을 입력하세요");
		Mat= sc.nextInt();
		System.out.println("과학점수을 입력하세요");
		Sci= sc.nextInt();
		System.out.println("역사점수을 입력하세요");
		His= sc.nextInt();
		Sum = Kor+Eng+Mat+Sci+His;
		System.out.print("총점수는"+Sum+"입니다");
		Avg = Sum/5;
		System.out.println("평균은"+Avg+"입니다");
		if (Avg>=90) {P='A';}
		else if (Avg>=80){P='B';}
		else if (Avg>=70){P='C';}
		else if (Avg>=60){P='D';}
		else {P='F';}
		System.out.println("당신의 학점은"+P+"입니다");
		*/
	// 문제 2 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 짝수인지 홀 수 인지 판정하는 프로그램을
    // 작성하세요. 단 , 조건 삼항 연산자를 이용하여 처리하세요~!
		Scanner sc= new Scanner(System.in);	
		int a;
		String b,c,d;
		c="짝수";
		d="홀수";
		System.out.println("정수를 입력하세요");
		a= sc.nextInt();
		b =a %2 ==0 ? c :d ;
		System.out.println(b);
		
		
		
		
		
		
	}

}
