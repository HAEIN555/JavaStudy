package review;
import java.util.*;
public class D005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*양의 실수만 입력받아 입력받은 값의 합의 평균을 구하고
	 * 음수가 나오면 그 이후부터 계산하게 만드세요..?
	 * 	양의 실수 1.1 양의 실수 2.2 양의 실수3.3 양의 실수 4.4 
	 *  음의 실수 -5.5 평균은 2.2입니다.
	 *  실수는 float으로 받으세요
	 */
	Scanner sc= new Scanner(System.in);
	System.out.println("양의 실수를 입력하세요");

	float i,avg;
	float hap=0;
	for(float a= sc.nextFloat();a>0;a++)
		hap=hap+a;
		//if(a<=0) {i=hap-a;}
		
	
	}
}
