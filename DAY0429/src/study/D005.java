package study;
import java.util.*;
public class D005 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*스캐너를 이용해서 소문자 알파벳을 하나 입력받고 
		 * 다음과 같이 출력하는 프로그램을 작성하세요
		 *  알파벳 입력 : e 
		 *  abcde
		 *  abcd
		 *  abc
		 *  ab
		 *  a
		 *  으로 나오게 출력하세요
		 */
	Scanner sc=new Scanner(System.in);
	System.out.println("알파벳을 입력하세요");
	char i,j,k;
	
	j =sc.next().charAt(0); // 문자열을 문자 하나만 받을 수 있게 바꾸어 준다.
	for(i=j;i>='a';i--) {
		for(k='a';k<=i;k++) {
		System.out.print(k);
		}System.out.println();
	}
	}
}
