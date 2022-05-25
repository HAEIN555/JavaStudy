package study;
/*
 *양의 실수만 입력받아 입력받은 합의 평균을 구하는 프로그램 구현
 *단, 음의 실수가 입력되면 계속하시오.
 
 *양의 실수 입력 : 1.1
 *양의 실수 입력 : 2.2
 *양의 실수 입력 : 3.3
 *양의 실수 입력 : 4.4
 *양의 실수 입력 : -5.5
 *지금까지의 평균 : 2.2
 * 
 */
import java.util.*;
public class ForExam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float total, input ;
		total = input = 0.0f; // 초기값을 동일한 자료형일때 옆처럼 동일하게 활용해도 된다 !
		
		int count = 0 ;
		for(;input>=0.0;) {
			total = total + input ;
			System.out.println("양의 실수 입력:");
			input = sc.nextFloat();
			count++;
		}
		
		System.out.println("지금까지의 평균:"+total/count);
		
	}

}
