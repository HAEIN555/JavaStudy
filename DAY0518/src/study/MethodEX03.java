package study;
// 여러가지 메소드를 만들어보장
/* 메소드는 기능이기때문에 여러가지 기능을 만들어보자
 * 1. 최대값  2. 사이의 합 3. 수열 4. 종료
 *  
 */
import java.io.*;
public class MethodEX03 {
	
	// 최대값 구하는 메소드 작성
		public static int aaa() throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("첫번째 정수 입력");
			int a=Integer.parseInt(br.readLine());
			System.out.println("두번째 정수 입력");
			int b=Integer.parseInt(br.readLine());
			if(a>b) {
				return a;// 반환 
			}
			return b;
		} //end aaa 
		
		//두수 사이의 합계를 구하는 메소드 
		public static void bbb() throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("첫번째 정수 입력");
			int a=Integer.parseInt(br.readLine());
			System.out.println("두번째 정수 입력");
			int b=Integer.parseInt(br.readLine());
			// 누적시킬 수 있는 변수 선언
			int tot=0;
			if(a>b) {
				a=a^b;
				b=b^a;
				a=a^b;
			} 
			for(int t=a;t<=b;t++) {
				tot +=t;
			}
			System.out.println(a+"~~~~~"+b+"합계는"+tot);
			return ; // return문뒤에는 무얼써도 변하는게 없고 오류
		}// end bbb 
	
		// 큰 순서대로 나열하는 수열을 구현하는 메소드
		// 3가지 정도..?  call by value 
		// 값이 넘어가니까 매개변수가 있어야해? 아마두... 
		public static String ccc (int  x, int  y, int  z) {// firstsu =x, secondsu =y, thirdsu =z
			if(y>=x&&y>=z) { // Y가 제일 클때 
				//swap 공식사용
				int temp =x;
				x=y;
				y=temp;
			}else if(z>=x&&z>=y) {//z가 제일 클때 
				int temp =x;
				x=z;
				z=temp;
			}if(z>=y) {
				int temp =y;
				y=z;
				y=temp;
			}String abc = x+">="+y+">="+z;
			return abc;
		}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=0 ; // 메뉴를 입력받을 변수 
		while(true) {
			System.out.println("입력하세요1.최대값  2.사이의 합 3.수열 4.종료");
			x=Integer.parseInt(br.readLine());
			if(x==1) { // return 값을 갖는다. return  값이 없으면 따로 변수 설정이 필요 없다
				int k =aaa();
				System.out.println("두수 중 최대값은 "+k+"입니다");
			}else if(x==2) {// 함수의 이름을 호출한다 call by name
				bbb();
			}else if(x==3) {// call by value 값을 활용해서 넘겨주는 
				System.out.println("첫번째 정수 입력");
				int firstsu=Integer.parseInt(br.readLine());
				System.out.println("두번째 정수 입력");
				int secondsu=Integer.parseInt(br.readLine());
				System.out.println("두번째 정수 입력");
				int thirdsu=Integer.parseInt(br.readLine());
			 String str = ccc(firstsu,secondsu,thirdsu);
				System.out.println("큰순으로 나열은 "+str);
			}else if(x==4) {
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				
				}System.out.println();
				
		}System.out.println("수고하셨습니다");
		
	}

}
