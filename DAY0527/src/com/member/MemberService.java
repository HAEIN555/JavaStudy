package com.member;
import java.util.*;
public class MemberService{

	void process (Action action, Scanner sc) { 
		
		//Action action = new WriteAction();
		action.execute(sc);//인터페이스의 다형성이용
	}
}
