package study;
import java.io.InputStream;
import java.util.*;
public class D002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열에는 정형(크기가 정해져있따.),비정형 배열(레기드 배열..?행은 정해졌지만 열은 정해지지않았다!다른말로가변배열)이 있다!
		// 다음시간에 배열배우니까 정리하기! 
		/*while문 문제!
		 * 사용자가 입력하는 정수를 계속해서 더해 나간다.
		 * 만약에 0이 입력되면 지금까지  입력된 정수의 합계를 출력하고 종료 하는 프로그램을 구현하세요!
		 */
		
	Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a=0;
		int b=0;
		while(a>=0){
			b=a+b;
			a++;
		    a=sc.nextInt();
			if(a==0) {break;}
		}
	System.out.println(b);
	
	int n =1, sum=0;
	while(true) {
		if(n==0) {break;}
		System.out.print("정수입력(0이면 종료)");
		n=sc.nextInt();
		sum=n+sum;
		
	}System.out.println("지금까지의 합계"+sum);
	
	
	
	
	
	
	
	
	
	}

	
}
