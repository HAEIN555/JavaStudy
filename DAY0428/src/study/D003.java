package study;
import java.util.*;
public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*사용자로부터 임의의 정수를 입력받아 1부터 입력받은 수까지의 전체합계
		 * 짝수 합계, 홀수 합계를 각각 출력하는 프로그램을 구현하고 10단위로 합계를 
		 * 출력하세요!
		 * 1-10 /1-20/1-30
		 * 1부터10까지 전체 합 55
		 * 1부터 10까지 짝수합
		 * 1부터 10까지 홀수합
		 */
	Scanner sc = new Scanner(System.in);
	int a,i;
	int even,odd,sum;
	even=odd=sum=0;
	System.out.println("숫자를 입력하세요");
	a=sc.nextInt();	
	for(i=1;i<=a;i++) {
		sum=sum+i;
		if(i%2==0) {even=even+i;}
		else if(i%2!=0) {odd=odd+i;}
		if((i%10==0)||(a==i)) {
		System.out.println("1부터"+i+"까지의 합계"+sum);
		System.out.println("1부터"+i+"까지의 짝수합계"+even);
		System.out.println("1부터"+i+"까지의 홀수합계"+odd);}
	}
	
	}
}
