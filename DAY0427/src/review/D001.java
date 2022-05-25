package review;

public class D001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1부터 10까지의 합계를 구해보세요
	// 일정한 패턴과 규칙을 찾아보는게 중요해요!
	// 초기값은 단 한번 잡습니다!
	System.out.println("for문인경우에");
	//1부터 10까지 반복처리하는 변수
	int i;// 반복처리하면서 누적합계를 저장하는 변수
	int sum=0;
	// 누적합계에 쓰레기가 들어가는 것을 방지하기 위해서 
	// 초기화를 해주어야 합니다!
	//for문 
	//for (;;)- 초기값x반복값도 없고 이건 무한 루프다!
	for (i=1;i<=10;i++) {
		sum=sum+i;
		System.out.println(i+" "+sum);		
	}
	//while문
	System.out.println("while문인경우에");
	int s=0;
	int total=0;
	s=1;
	while(s<=10) {
		total=total+s;
		s++;
		System.out.println(s+" "+total);
		}
	int r=1;
	int hap=0;
	do {
		hap=hap+r;
		System.out.println(r+" "+hap);
		r++;
	}while(r<=10);
	
	
	
	}
}
