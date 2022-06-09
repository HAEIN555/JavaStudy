package com.loginex;
import java.util.*;
public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		LoginService loginService = new LoginService();
		do {
			System.out.println("로그인 화면입니다.");
			System.out.println("아이디와 비밀번호를 입력하세요 ");
			System.out.print("ID");
			String id = sc.next();
			System.out.println("PassWord");
			String passworkd = sc.next();
			
			UserVO user = loginService.login(id, passworkd);
			if(user == null) {
				System.out.println("아이디와 비밀번호가 일치 하지 않습니다.");
			}else {
				System.out.println("로그인한 사용자 정보입니다.");
				System.out.println(user);
				isStop = true;
			}
		} while (! isStop);
	}

}
