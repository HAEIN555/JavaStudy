package study;
import java.io.*;
public class D004 {
	/* 두개의 정수와 배수 n 값을 입력받아 두수 사이의 n값을 배수의 합을 구하는 프로그램을 작성하세요
	 	정수 두개의 배수를 입력받음
	 */
	public static void main(String[] args)throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	int a,b,c,i=0;
	int sum=0;
	System.out.println("첫번째 수를 입력하세요");
	a=Integer.parseInt(br.readLine());
	System.out.println("두번째 수를 입력하세요");
	b=Integer.parseInt(br.readLine());
	System.out.println("배수를 원하는수를 입력하세요");
	c=Integer.parseInt(br.readLine());
	if(a>b) {
		a=a^b;
		b=b^a;
		a=a^b;
	}
	for (i=a;i<=b;i++) {
		if(i%c==0) 
		{sum+=i;}
	}
	System.out.println(c+"배수의 합은"+sum);
	}
// 명심할건 배수를 나타내는건 *뿐만아니라 나머지와 나눗셈도 있다!
}
