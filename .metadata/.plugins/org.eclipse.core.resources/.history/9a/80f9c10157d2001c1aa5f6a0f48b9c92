package study;
import java.io.*;
public class Test03 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*사용자로부터 임의의 정수 세개를 입력받아 작은수에서 큰수 순으로 출력하는 프로그램을
		 * 작성한다.
		 */
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫번째정수를 입력하세요");
		int a=Integer.parseInt(br.readLine());
		System.out.println("두번째정수를 입력하세요");
		int b=Integer.parseInt(br.readLine());
		System.out.println("세번째정수를 입력하세요");
		int c=Integer.parseInt(br.readLine());
		
		
		  if (a>b) {a=a^b; b=b^a; a=a^b;}
		  // 만약 첫번째 정수가 두번째 정수보다 크다면 두정수의 자리를 바꾸어준다.
		  //temp=a; a=b; a=temp;
		  if(b>c) {b=b^c; c=c^b; b=b^c;}
		  // 만약 두번째 정수가 세번째 정수보다 크다면 두정수의 자리를 바꾸어준다.
		 //temp=b; b=c; c=temp;
		  if (a>b) {a=a^b; b=b^a; a=a^b;}
		 // 만약 첫번째 정수가 두번째 정수보다 크다면 자리를 바꾸어준다.
		 //temp=a; a=b; a=temp;
		System.out.println(a+","+b+","+c);
		
	/* 일단 BufferedReader를 써서 숫자를 입력한다.
	 * 두번째는 만약에 a = 32 b=56 c=52의 값이 있다고 가정하고 
	 * xor 게이트를 사용해서 a=a^b;b=b^a;a=a^b; (--> a와 b의 자리를 바꾸어준다)
	 * a>b보다 크다면  바꾸어 주고  b>c보다 크다면 바꾸어주고 
	 * 다시 a와 b를 비교해서 크다면 바꾸어준다! 그다음 출력해주기! 	
	 */
	//xor 공식 a와b를 바꾸어준다. a=a^b;b=b^a;a=a^b;
			
	/*
	 * 		
	 */
			
	}

}
