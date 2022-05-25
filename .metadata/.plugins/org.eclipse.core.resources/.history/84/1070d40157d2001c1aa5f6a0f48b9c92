package study;
/*1에서부터 10까지의 합계를 구한다.
 * 1+2+3+4+5+6+7+8+9+10
 */
public class D001 {
	public static void main(String[] args) {
   // 1부터 10까지 더한다면 규칙! 패턴! 하나씩 증가한다는 것을 생각하기! 
  // 일정한 패턴과 규칙을 찾아보기		
 // 초기값은 단 한번 
		System.out.println("for 문일경우에");
		// 1부터 10까지 반복처리하는 변수
		int i ;
		// 반복 처리하면서 누적합계를 저장하는 변수 
		int sum=0; // 누적합계는 쓰레기가 들어가는 것을 방지 하기 위해서 반드시 초기화! 
		// 그다음에는 반복을 시켜주는 문장이 들어간다! 
		// for 문 
		/*for (;;)// 초기값도 없고 반복값도 없고 구래서 이건 무한 루프이다!
		{	}		
		*/
		//for(1;10;1)// 1부터 10까지 하나씩 증가한다!
		for (i=1;i<=10;i++/*i=i+1*/)	
		{
			sum=sum+i;
			System.out.println(i+" "+sum);}
		// 디버그 모드로 확인해보자! 
		
		//while문으로 작성해보자!
		System.out.println("while 문일경우에");
		int s=0;
		int total=0;
		s=1;
		while(s<=10) {
			total=total+1;
			s++;
			System.out.println(s+" "+total);
		}
		// for문과 while문을 다 같이 쓸경우에는 sum을 초기화 해주어야한다!
		System.out.println("do while 문일경우에");
		int r=1;
		int hap=0;
		do {
			hap=hap+r;
			System.out.println(r+","+hap);
			r++;
		}while(r<=10);	
	}
}
