package study;
import java.util.*;
public class D004 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*입력받은 정수의 평균을 구하는 프로그램을 작성하세요
		 * 제일먼저 입력할 정수의 개수를 사용자로 부터 입력받는다.
		 * 입력받은 수 만큼 평균값을 구하여 출력한다.
		 * 평균값은 실수로 처리한다.
		 */
	Scanner sc=new Scanner(System.in);
	int num1,num2,m;
	int sum=0;
	double avg=0;
	System.out.println("갯수를 입력하세요");
	num1=sc.nextInt();
	
	for(m=1;m<=num1;m++) {
		System.out.println("정수를 입력하세요");
		num2=sc.nextInt();
		sum=sum+num2;
	}
	avg=(double)sum/num1;
	System.out.printf("입력한 정수의 평균:%.2f\n",avg);
	}
}
