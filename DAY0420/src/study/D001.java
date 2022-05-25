package study;

import java.util.*;

public class D001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 if 실습해보장 문제풀이
		/*Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("점수을 입력하세요");
		a= sc.nextInt();
		System.out.println("학년을 입력하세요");
		b= sc.nextInt();
		
		if (a >= 60)60점이상이면 {
			if (b != 4)4학년이 아니면{ 
				System.out.print("합격");
			}else if (b==4&& a >= 70)4학년이 70점이상이면 {
				System.out.print("합격");
			} else4학년이 70점미만이면  {
				System.out.println("불합격");
			}
		}else/*점수60점미만이면 
			System.out.println("불합격");
		*/
			
	//먼저 문제 파악하는 것이 중요!
	// 다중if를 실습해보장
	// 순서대로 하면 돼! 
	// 문제! 5개의 과목의 점수를 입력받아 총점과 평균을 구하고 평균을 이용하여 학점을 판정하는
	// 프로그램을 구현하세요~ 다중if ----> else if를 사용해보장 
	//학점은 A-90점이상 B-80점이상 C-70점이상 D-60점이상 F-60점 미만
	// 변수처리,합계변수,평균점수, 학점을 판정 
		Scanner sc= new Scanner(System.in);
		int Kor,Eng,Mat,Sci,His,Sum,Avg;
		char A ='A';
		char B ='B';
		char C ='C';
		char D ='D';
		char F = 'F';
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
		System.out.println("총점수는"+Sum+"입니다");
		Avg = Sum/5;
		System.out.println("평균은"+Avg+"입니다");
		if (Avg>=90) {System.out.print("학점은"+A+"입니다");}
		else if (Avg>=80) {System.out.print("학점은"+B+"입니다");}
		else if (Avg>=70) {System.out.print("학점은"+C+"입니다");}
		else if (Avg>=60) {System.out.print("학점은"+D+"입니다");}
		else {System.out.print("학점은"+F+"입니다");}
		
	}

}
