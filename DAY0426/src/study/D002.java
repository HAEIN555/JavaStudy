package study;
import java.util.*;
public class D002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 사칙연산을 입력받아 계산하는 프로그램을 작성하세요 
		 * 연산자는 +-/* 네가지로 실수 처리 하세요
		 * 피연산자와 연산자는 빈칸으로 분리하여 입력
		 * 0으로 나누기시 0으로 나눌 수 없습니다. 를 출력하고 종료함
		 * switch case 문은 이용하여 작성 
		 * 연산자는 Scanner를 사용해서 문자열로 입력받으세요
		 */
		Scanner sc= new Scanner(System.in);
		
		double yon1,yon2,result=0;// 피연산자
		String yon;// 연산자
		System.out.print("숫자와 연산자와 숫자를 입력하세요");
		yon1 =sc.nextInt();
		yon = sc.next();
		yon2=sc.nextInt();
		
		
		/*switch (yon) {
		case "+":
			System.out.printf("%d %s %d=%d\n",yon1,yon,yon2,(yon1+yon2));
			break;
		case "-":
			System.out.printf("%d %s %d=%d\n",yon1,yon,yon2,(yon1-yon2));
			break;
		case "*":
			System.out.printf("%d %s %d=%d\n",yon1,yon,yon2,(yon1*yon2));
			break;
		case "/":
			System.out.printf("%d %s %d=%d\n",yon1,yon,yon2,(yon1/yon2));
			if (yon2==0){System.out.println("0으로 나눌 수 없습니다.");}
			return;
			
		default:
			System.out.println("사칙연산이 아닙니다.");
			break;
		}
		*/
		
		// if (yon2==0){System.out.println("0으로 나눌 수 없습니다.")}
		
		 
		
		switch (yon) {
		case "+":
			result= yon1+yon2;
			break;
		case "-":
			result= yon1-yon2;
			break;
		case "*":
			result= yon1*yon2;
			break;
		case "/":
			
			if (yon2==0){System.out.println("0으로 나눌 수 없습니다.");
			return;
				}
			result=yon1/yon2;
			break;

		default:
			System.out.println("사칙연산이 아닙니다.");
			break;
		}
		System.out.println(yon1+" "+yon+" "+yon2+"="+result);	
	}
}
