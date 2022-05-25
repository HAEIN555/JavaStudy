package study;
import java.util.*;
public class D004IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 2개를 입력받아 연산를 해보자!
				// if 문과 연산자를 잡아서 
				//연산자를 char가 아닌 String으로 잡을때에! 두가지 방법
				// 첫번째는 굳이 sc.next();.charAt. 을 넣지 않고 sc.next();로 잡은 후에 
				// 연산의 표시에 작은 따옴표 ' 가 아닌 "" 큰따옴표를 써서 표시
				// 그다음에 printf표시 할때에도 %c가 아닌 %s로 표시 
		        // 두번째 방법 동일하게 sc.next();로 표시하지만 if 문에서 if(s.equls("+"))로 표시!
				//s.equls("+")	
				Scanner sc= new Scanner(System.in);
				int a,b;
				String op;
				System.out.print("첫번째 정수를 입력하세요");
				a= sc.nextInt();
				System.out.print("연산자를 입력하세요");
				op= sc.next();
						
				System.out.print("두번째 번째 정수를 입력하세요");
				b=sc.nextInt();
				// 다중if 문  동급의 if 여러개 있다
				if (op=="+") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a+b));
				}else if(op=="-") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a-b));}
				else if(op=="*") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a*b));}
				else if(op=="/") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a/b));}
				else if(op=="%") {
				System.out.printf("%d %s %d=%d\n",a,op,b,(a%b));}
				else {System.out.println("연산자가 아닙니다");}
	}
}
