package com.loginex;
import java.util.*;
public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		LoginService loginService = new LoginService();
		do {
			System.out.println("�α��� ȭ���Դϴ�.");
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ��� ");
			System.out.print("ID");
			String id = sc.next();
			System.out.println("PassWord");
			String passworkd = sc.next();
			
			UserVO user = loginService.login(id, passworkd);
			if(user == null) {
				System.out.println("���̵�� ��й�ȣ�� ��ġ ���� �ʽ��ϴ�.");
			}else {
				System.out.println("�α����� ����� �����Դϴ�.");
				System.out.println(user);
				isStop = true;
			}
		} while (! isStop);
	}

}
