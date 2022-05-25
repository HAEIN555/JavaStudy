package study;
import java.util.*;
public class S002 {

	public static void main(String[] args) {
		/* 임의의 숫자가 들어있는 배열의 숫자 데이터들 중 
		 * 짝수인 요소만 출력하고 3의 배수인 요소만 골라서 출력하는 
		 * 프로그램을 만드세요
		 * 
		 * 임의 숫자 : 4.7.9.1.3.2.5.6.8
		 * 
		 * 1.배열의 전체 요소 출력 : 4.7.9.1.3.2.5.6.8
		 * 2. 짝수만 출력  : 4.2.6.8
		 * 3. 3의 배수만 출력 :9.3.6
		 * 
		 */
		Scanner sc= new Scanner(System.in);
		int ant[]= {4,7,9,1,3,2,5,6,8};
		
		/*for (int i =0;i <9;i++ ) {
			System.out.println("정수를 입력하세요");
			ant [i]=sc.nextInt();}*/
		for (int i=0;i<9;i++) {
			System.out.printf("%4d,",ant[i]);
		}
		for (int i=0;i<ant.length;i++) {
			System.out.printf("%d,",ant[i]);
		}
		for (int temp :ant) {
			System.out.printf("%d,",temp);
		}
		System.out.println();
		
		System.out.println("짝수 출력");
		for (int i=0;i<ant.length;i++) {
			if(ant[i]%2==0)
			System.out.printf("%4d,",ant[i]);
		}
		System.out.println();
		System.out.println("3배수 출력");
		for (int i=0;i<ant.length;i++) {
			if(ant[i]%3==0)
			System.out.printf("%4d,",ant[i]);
		}
			
		
		
	}

}
