package study2;
import java.util.*;
public class MemberService {
	void process(Action action,Scanner sc) {// 인터페이스 실행 처리 목적
		action.execute(sc);// 인터페이스의 다형성이용 
		
	}
}
