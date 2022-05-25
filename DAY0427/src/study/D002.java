package study;

public class D002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10까지의 짝수의 합을 구하세요!
		int i;
		int even=0;
		for(i=1;i<=10;i++) {
			if(i%2==0) {System.out.println(i+" "+even);}
			else continue;
			even=even+i;
			}
	
	System.out.println("짝수의 합계;"+even);	
	
	// 1부터 10까지의 홀수의 합의 구하세요!
			int t;
			int odd=0;
			for (t=1;t<=10;t++)
			{
			if(t%2!=0) {
				System.out.println(t+" "+odd);
			}
			else continue;
			odd=odd+t;
			}
			System.out.println("홀수의 합계"+odd);
			
			int sum;
			int r;
			for(r=1;r<=10;r++) {
				if(r%2==0) {System.out.println(r+" "+even);}
				else if(r%2!=0) {System.out.println(r+" "+odd);}
			}
		sum = even+odd;
		System.out.println("짝수와 홀수의 총합"+sum);	
	}

}
