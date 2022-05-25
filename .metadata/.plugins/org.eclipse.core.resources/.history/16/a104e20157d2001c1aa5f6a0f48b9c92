package study;

import java.util.*;

public class S008_jungdad {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 
		 String [] str = {"가위","바위","보"};
		Random rd = new Random();
		// 난수 - 임의의 수 랜덤으로 지정한다.
		int com = rd.nextInt(3)+1; // 0부터 시작해서 1를 더하기 위해
		int user;
		do {
			System.out.print("1.가위2.바위3.보자기");
			user = sc.nextInt();
		}while(user<1||user>3);
		//System.out.println("사용자 :"+str[user-1]);
		//System.out.println("컴퓨터 :"+str[com-1]);
		// 중간에 뭐가 나온지 보려고
		//처리 결과 출력
		
		String result;
		result ="무승부";
		// 사용자가 승리한 경우
		if((user==1&&com==3)||(user==2&&com==1)||(user==3&&com==2))
			result ="사용자가 승리함";
		// 컴퓨터가 승리한 경우	
		if((user==1&&com==2)||(user==2&&com==3)||(user==3&&com==1))
			result ="컴퓨터가 승리함";
		System.out.println("최종승부결과"+result);
	}

}
