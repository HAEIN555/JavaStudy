package study;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int sum = 0 ;
		int even = 0, odd =0;
		
		System.out.println("for문일 경우");
		
		
		for(i=1;i<=10;i++) 
		{
		if (i%2==0) { // 짝수일때
		//if(i%2!=0){// 홀수일때
			even = even + i ;
		//System.out.println(i+","+even);
		}else {
			odd = odd + i ;
		//System.out.println(i+","+odd);
	
		//	continue ;}
		}
		
	}
	System.out.println("짝수의 합계 : "+even);
	System.out.println("홀수의 합계 : "+odd);
	sum = even + odd ;
	System.out.println("총합계 : "+sum);

	}
}
