package study;
public class D001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 중첩 for문 - 바깥 for문 / 안쪽 for문 
		 * 
		 */
		/* 첫번째 for문은 행을 나타내고 두번째 for문은 열을 나타낸다
		 *  System.out.print 을 찍어주면 
		 *  \t 탭해준다! 한문자 탭
		 */
	// 변수란 어떤값에 메모리를 저장할 수 있는 값
	// 구구단을 만들어보장
		// 변수 선언
		int i,j;// i라는 변수는 단을 의미 , j라는 변수는 내부에서 1-9까지 반복처리하는 변수
		
		for(i=2; i<=9;i++) {
			//System.out.println("******"); - 행이 9줄이 나온다!for 문을 하나만썼을때 행이 증가!
			for(j=1;j<=9;j++) {
			System.out.printf("%d X %d =%d\t",i,j,i*j); //- 열이 9줄이 나온다! 열이 증가하는거! 
			//System.out.print("*");	
			}// 안쪽 루프가 끝나는 시점
			System.out.println();//2X1=2 다음에 행을 내려주기 위해서! 이걸안써준다면 행으로 계속 이어진다...!
		}
			
	}
}
