package study;
import java.util.*;
public class D005 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*양의 실수만 입력받아 입력받은 합의 평균을 구하는 프로그램을 구현
			단 음의 실수가 입력되면 계산 하세요
			양의 실수 1.1
			양의 실수 2.2
			양의 실수 3.3
			양의 실수 4.4
			양의 실수 -5.5
			지금까지의 평균2.2
			실수는 float으로 받으세요! next float*/
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
				System.out.println("지금까지의 평균:"+total/count);}

		
	
	
	
	
	
	
	/*2중 for문 대표적인 예가 구구단이다! 
	 * 
	 */
	}


