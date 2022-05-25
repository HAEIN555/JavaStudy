package study;

import java.util.Random;
import java.util.Scanner;

public class S001 {

	public static void main(String[] args) {
		/*
		 * 0에서부터 99까지 임의의 수를 가진 카드를 한장 숨기고 이카드 수를 맞추는 게임! 카드속의 수가 77이라면! 수를 맞추는 사람이 55를
		 * 입력하면 더 높게! 다시 70을 입력하면 더 높게라는 식으로 범위를 좁혀가면서 게임을 맞추는 것임 게임을 반복하기 위해 y/n를 묻고
		 * n인경우는 종료함 컴퓨터가 숨길 수를 임의로 선택하기 위해 Random클래스를 사용함 랜덤 클래스 사용법은 1 import
		 * java.util.*;2.Random r= new Random();(main메소드 안에 작성) int i = r.nextInt(100)을
		 * 의미는 0-99까지의 임의의 정수를 생성함 String str=sc.next();
		 * if(str.equal("n")){System.exit(0); break;}
		 */
		/*
		 * Scanner sc= new Scanner(System.in); Random r= new Random(); int i =
		 * r.nextInt(100);// 정답 int j = 0; while(j<100) {
		 * System.out.print("숫자를 입력하세요 : "); j= sc.nextInt();// 입력하는 수 if(i==j) {
		 * System.out.println("정답입니다 계속하시겠습니까?"); String str=sc.next();
		 * if(str.equals("n")){문자열을 비교할때 equals를 사용한다. System.exit(0);} else if
		 * (str.equals("y")) { j = 0; i = r.nextInt(100);// 정답 } }else if(i>j) {
		 * System.out.println("값이 작습니다."); }else if(i<j) { System.out.println("값이 큽니다");
		 * } }
		 */
		// 위에 방식은 입력값이 초과하거나 너무낮은 수가 들어간경우에 사용할 수 없다.
		// 다른방식으로도 풀어보자!
		 Scanner sc=new Scanner(System.in);
		 Random r= new Random();
		 // 변수 선언 low,high,card
		 int low,high,card;
		// y/n 문자열이 들어오면 게임을 반복진행여부를 판정한다.
		 while(true) {
			 int i =0;// 사용자의 시행횟수 - 내가 몇번만에 맞추었는지!
			 low =0;// 카드의 최소범위!
			 high =99;// 카드의 최대범위!
			 //0과 99사이의 정수(난수)값을 생성합니다.(숨김값)
			 card =r.nextInt(100);
			 System.out.println("숨겨져있는 카드 값를 맞춰보세요!");
			/*내가 맞추어야 하니까 반복하는 while*/
			 while(true) {
				 System.out.println("입력하실 수 있는 값의 범위"+low+"~"+high+"입니다");
				 int n = 0;
				 n=sc.nextInt();// 값을 입력받는다.
				 // 입력한 값이 범위를 벗어난 경우와 정상적인 경우를 판정
				 if(n>high||n<low) {
					 System.out.println("입력받은 값은 범위를 초과했습니다.");
				 }
				 else {
					 if(n==card) {System.out.println("정답입니다 축하해요~!");
					 break;}
					 else if(n>card) {/*입력된 값이 숨겨진 카드보다 큰경우*/
						 System.out.println("더 낮은 값을 입력하세요!");
						 high =n; }
					 else {/*입력된 값이 숨겨진 카드보다 작은경우*/
						 System.out.println("더 큰값을 입력하세요!");
						 low=n; }
					 
				 }
				 i++;// 시행횟수 증가
			 }// 안쪽 end while 문
			 System.out.println("계속 게임을 진행하시겠습니까?(y/n)");
			 if(sc.next().equals("n"))
				break;
		 }// 바깥쪽 end  while문
	}
}
