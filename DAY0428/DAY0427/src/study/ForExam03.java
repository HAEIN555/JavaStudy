package study;
/* 두 개의 정수와 배수 n값을 입력받아 두 수 사이의 n값을 배수의 합을 구하는 프로그램을 작성하시오.
 * 정수 두개의 배수를 입력받음
 */
import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a, b, n, i,sum = 0 ;
		
		System.out.println("첫번째 정수는?");
		a = sc.nextInt() ;
		System.out.println("두번째 정수는?");
		b = sc.nextInt() ;
		System.out.println("n의 배수는");
		n = sc.nextInt();
		
		if(a>b) {
		a=a^b;
		b=b^a;
		a=b^a;
	}
	
		for(i=a ; i<=b ; i++) 
		{
			if(i%n==0) {
				sum +=i;
			}
		
		}
		System.out.println();
		System.out.println(a+"에서"+b+"사이의 배수의 합계는? :"+sum+"입니다.");
}
}