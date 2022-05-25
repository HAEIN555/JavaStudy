package study;

/*정수 두개를 입력받아 두 수 사이의 수들을 합계를 구하는 프로그램을 작성하시오.
 * 
 */
import java.io.*;
import java.util.Scanner;

class ForExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,i,sum =0;	
		System.out.println("첫번째 정수는 ? : ");
		a = sc.nextInt();
		System.out.println("두번째 정수는 ? : ");
		b = sc.nextInt();
		
		if (a>b) {
			/*int temp ;
		
			temp = a ;
			a = b ;
			b = temp ;*/// 스왓 공식 사용
		
			a=a^b;
			b=b^a;
			a=b^a;
		}
		
		for	(i=a;i<=b;i++) {
			sum += i ;
			}
			System.out.println("두 수 사이의 합은 ? :"+sum);
			
			}		
	}