package study;
/* 정수 두개를 입력받아 두 수 사이의 수들을 합계를 구하는 프로그램을 작성하세요
 * 1부터 10이라면 1부터 10까지 더하고 만약 10을 받고 2를 받았다면..?
 * 작은수부터 큰수대로 더하세요!
 */
import java.util.*;
public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	int a,b,i;
	int sum=0;
	System.out.println("숫자를 입력하세요");
	a=sc.nextInt();
	System.out.println("숫자를 입력하세요");
	b=sc.nextInt();
	if(a>b) {
		a=a^b;
		b=b^a;
		a=a^b;
	}// a가 b보다 클때만 사용!!!!!! 
	for(i=a;i<=b;i++)// 변수를 하나 더 세우기
	{sum=sum+i;}
	System.out.println("총 합계는"+sum+"입니다" );
	}
}
/*if(a>b)
 * { 스왑으로 하는 공식!
 * int temp;
 * temp=a;
 * a=b;
 * b=temp;
 *  }
 * for(i=a;i<=b;i++)
 * { sum +=i;}
 * System.out.println("총 합계는"+sum+"입니다" );
 */

