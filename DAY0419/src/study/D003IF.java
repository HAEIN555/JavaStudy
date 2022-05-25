package study;
import java.util.*;
public class D003IF {

	public static void main(String[] args) {
		// 정수 2개를 입력받아 연산를 해보자!
		// if 문과 연산자를 잡아서
		Scanner sc= new Scanner(System.in);
		int a,b;
		char op;
		System.out.print("첫번째 정수를 입력하세요");
		a= sc.nextInt();
		System.out.print("연산자를 입력하세요");
		op= sc.next().charAt(0);
				
		System.out.print("두번째 번째 정수를 입력하세요");
		b=sc.nextInt();
		// 다중if 문  동급의 if 여러개 있다
		if (op=='+') {
		System.out.printf("%d %c %d=%d\n",a,op,b,(a+b));
		}else if(op=='-') {
		System.out.printf("%d %c %d=%d\n",a,op,b,(a-b));
		}
		else if(op=='*') {
		System.out.printf("%d %c %d=%d\n",a,op,b,(a*b));
		}
		else if(op=='/') {
		System.out.printf("%d %c %d=%d\n",a,op,b,(a/b));
		}
		else if(op=='%') {
			System.out.printf("%d %c %d=%d\n",a,op,b,(a%b));
		}
		else {
			System.out.println("연산자가 아닙니다");
		}
	}

}
