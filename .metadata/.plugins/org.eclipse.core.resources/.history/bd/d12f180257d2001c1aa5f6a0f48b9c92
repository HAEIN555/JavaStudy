package study;
import java.util.*;
public class S004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*0에서부터 99까지 임의의 수를 가진 카드를 한장 숨기고
		 * 이카드 수를 맞추는 게임! 카드속의 수가 77이라면!
		 * 수를 맞추는 사람이 55를 입력하면 더 높게! 다시 70을
		 * 입력하면 더 높게라는 식으로 범위를 좁혀가면서 게임을 맞추는 것임
		 * 게임을 반복하기 위해 y/n를 묻고 n인경우는 종료함
		 * 컴퓨터가 숨길 수를 임의로 선택하기 위해 Random클래스를 사용함
		 * 랜덤 클래스 사용법은 1 import java.util.*;2.Random r= new Random();(main메소드 안에 작성)
		 * int i = r.nextInt(100)을 의미는 0-99까지의 임의의 정수를 생성함
		 * String str=sc.next();
		 * if(str.equal("n")){System.exit(0);
		 * break;}
		 */
		Scanner sc= new Scanner(System.in);
		
		Random r= new Random();
		int i = r.nextInt(100);// 정답
		
		int j = 0;
		while(j<100) {
			System.out.print("숫자를 입력하세요 : ");
			j= sc.nextInt();// 입력하는 수
			if(i==j) {
				System.out.println("정답입니다 계속하시겠습니까?");
				String str=sc.next();
				if(str.equals("n")){/*문자열을 비교할때 equals를 사용한다.*/
					System.exit(0);}
				else if (str.equals("y")) {
					 j = 0;
					 i = r.nextInt(100);// 정답
					 }
			}else if(i>j) {
				System.out.println("값이 작습니다.");
			} else if(i<j) {
				System.out.println("값이 큽니다");
			}	
		}
	
	}

}
