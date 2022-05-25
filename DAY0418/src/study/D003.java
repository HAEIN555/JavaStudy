package study;

/* 숫자 하나 입력받을 때 사용
 *  - System.in.read() -48 or '0'
 */
import  java.io.IOException;
public class D003 {
	public static void main(String[] args) throws IOException {
		
		int num1;
		int num2;
		System.out.print("숫자 1:");
		num1= System.in.read()-48;
		// 일단 아스키 코드 값을 받는다 그리고 0의 값인 48을 빼주어서 하나의 정수를 시작하게 만든다.?
		// 아스키 코드 값에서 48을 빼줌으로서 숫자 0부터 시작하게 만든다.?
		//또 다른 값을 넣어줄때 enter키를 넣어주어서 입력을 받으므로 enter 와 줄바꿈 키가 필요하다!
		System.in.read();// \r   enter 키를 의미한다.
		System.in.read();// \n 줄바꿈을 의미한다.
		// enter처리를 하지 않으면 숫자가 입력되지 않는다. 
		System.out.print("숫자 2:");
		num2= System.in.read()-48; 
	
		System.out.println(num1+","+num2);
		
		// 한자리 숫자를 입력받을때 아스키 코드에서 -48한 값의 한자리수의 정수를 받는다.
		// 
		
	}
}
