package study;

/*1에서 부터 10까지의 합계를 구한다.
 * 
 * 1+2+3+4+5+6+7+8+9+10
 */

public class ForExam01 {

	public static void main(String[] args) {
		// 1 ~ 10까지 반복처리하는 변수
		int i = 0 ;
		//반복처리하면서 누적합계를 저장하는 변수
		int sum = 0; // 누적합계는 반드시 초기화를 해줘야함.
		System.out.println("for문일 경우");
		for(i=1;i<=10;i++) 
		{
		sum = sum + i ;
		System.out.println(i+","+sum);}
		System.out.println();
		
		
		
		System.out.println("while문일 경우");
		i=1; 
		sum = 0 ;
		while(i<=10) {
			sum = sum+i;
			System.out.println(i+","+sum);			
			i++;
		}
		
		
		
		System.out.println();
		System.out.println("do~while문일 경우");
		i=1; 
		sum = 0 ;
		do {
			sum = sum+i;
			System.out.println(i+","+sum);			
			i++;
		}while(i<=10) ;
		
	}
}