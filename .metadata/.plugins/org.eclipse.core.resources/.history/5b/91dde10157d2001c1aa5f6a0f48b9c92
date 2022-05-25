package study;
import java.util.*;
public class S007 {

	public static void main(String[] args) {
		/* 컴퓨터와 사용사 사이의 가위바위 보 게임을 만든다. 
		 * 사용자가 먼저 3가지중 하나를 입력하고 실행한다.
		 * 컴퓨터는 랜덤으로 하나를 선택하여 사용자와 비교함
		 * 누가 이겼는지를 판단하고 사용자가 그만을 입력하면 게임을
		 * 종료한다.
		 * 
		 * 가위바위보 : 바위
		 * 사용자가 바위 ,컴퓨터가 가위다 사용자가 이김
		 * 가위바위보 : 그만
		 * 게임을 종료합니다.
		 * 문자열 배열 선언
		 * Stirng [] str = {"가위","바위","보"};
		 * 컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는 
		 * int n = (int)(Math.random()*3);
		 * 
		 * 컴퓨터가 낸 것이 바위인지 비교 
		 * if(str[n].equals("바위"))
		 */
		Scanner sc= new Scanner(System.in);
		 String [] str = {"가위","바위","보"};
		 while(true) {
			 System.out.println("가위,바위,보 중에 입력하세요");
				String user =sc.next();
				 int n = (int)(Math.random()*3);
				 if(user.equals("그만")) {break;}
				 if(user.equals(str[n])) {System.out.println("비겼습니다");}
				 if((str[n].equals("바위"))&&(user.equals("가위"))) {System.out.println("컴퓨터가 이겼습니다.");}
				 if((str[n].equals("보"))&&(user.equals("바위"))) {System.out.println("컴퓨터가 이겼습니다.");}
				 if((str[n].equals("가위")) &&(user.equals("보"))){System.out.println("컴퓨터가 이겼습니다.");}
				 if((str[n].equals("보"))&&(user.equals("가위"))) {System.out.println("사용자가 이겼습니다.");}
				 if((str[n].equals("가위")) &&(user.equals("바위"))) {System.out.println("사용자가 이겼습니다.");}
				 if((str[n].equals("주먹"))&&(user.equals("보"))) {System.out.println("사용자가 이겼습니다.");}
				
				 
				
				
			 
		 }
		 
	}

}
