package study;
 import java.io.*;
public class Test02 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/* 사용자로 부터 임의의 정수를 입력받아 입력받은 정수가 2의 배수인지 3의 배수인지
		 *  2와3의 배수인지 2와 3의 배수가 아닌지를 결과를 출력하는 프로그램을 구현한다.  
		 */
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("정수를 입력하세요");
	int a=Integer.parseInt(br.readLine());
	
	if(a%3==0&&a%2==0) {
		System.out.println("2와3의배수입니다");}
	
	    else if(a%2==0) {System.out.println("2의 배수입니다");}
		else if(a%3==0) {
			System.out.println("3의배수입니다");}
		else
		{System.out.println("2와3의 배수가 아닙니다");}
	
	
	
	}

}
