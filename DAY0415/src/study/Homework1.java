package study;
	
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세가지의 과목이 있다. 과목의 이름은 국어 영어 수학 
		// 위의 3과목의 점수를 입력 받아 총점, 평균을 출력하는 프로그램을 만들어라 
		// 단 평균은 소수 2자리까지 출력하세요 
		// 입력은 스캐너 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int a =Integer.parseInt(sc.next());
		System.out.println("수학점수를 입력하세요");
		int b = Integer.parseInt(sc.next());
		System.out.println("영어점수를 입력하세요");
		int c = Integer.parseInt(sc.next());
		
		int total = a + b +c;
		System.out.println("총점은"+total);
		double average = total/3;
		System.out.printf("평균은%.2f\n",average);
		
		sc.close();
		
	}

}
