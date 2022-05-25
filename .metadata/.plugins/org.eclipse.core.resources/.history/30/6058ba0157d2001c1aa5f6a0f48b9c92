package study;

	import java.util.*;

public class D001 {
	public static void main(String[] args) {
		
		// char 은 2바이트이고 
		// '' 홑따옴표 싱글 쿼터를 사용한다.
		// 아스키 코드는 1바이트 문자를 표현 0-255 까지 문자 범위 표현 
		// 유니코드는 2바이트 문자를 표현 0-65535 까지 문자 범위 표현
		
		char ch1 = 'A';
		char ch2 = '\u0041'; // 유니코드라서 여러글자 표현 가능 유니코드는 2byte
		//2byte 라서 16진수이다.  이 16진수를 10진수를 바꾸면 4*16^1+1*16^0
		//값은 65이고 이것은 대문자  A를 나타낸다.
		System.out.println((int)ch1); //(int) 을 사용하면 정수형으로 바꾸어 준다. 
		System.out.println((int)ch2); 
		System.out.println((char)(ch1+ch2));// (char) 을 사용하면 문자형으로 나타내준다.
		// (char)(ch1+ch2)) 이렇게 까지 해야 한다.  공식같은거야!
		
		//0이 아스키코드로는 48이다?
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문자 입력");
		String str = sc.next();
		System.out.println(str);
		
		
	
	}
}
