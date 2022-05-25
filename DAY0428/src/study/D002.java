package study;

import java.io.*;
public class D002 {
	/* 무한대로 두개의 정수를 입력받아 합계를 구하는 프로그램을 작성하세요!
	 * 무한대로...?
	 * 변수  첫번째는 n1,두번째는 n2
	 */
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int sum=0;
	for(;;) {
		System.out.println("정수입력");
		int n1=Integer.parseInt(br.readLine());
		if(n1==0)
			break;
		int n2=Integer.parseInt(br.readLine());
		System.out.println("두수의 합계"+(n1+n2));
	}
	// 무한 루프
	while(true) {
		System.out.println("정수입력");
		int n1=Integer.parseInt(br.readLine());
		if(n1==0)
			break;
		int n2=Integer.parseInt(br.readLine());
		System.out.println("두수의 합계"+(n1+n2));
	}
		
		
		
		
		
		
		
		
		
		
		
	}
}
