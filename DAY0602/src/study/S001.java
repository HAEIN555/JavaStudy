package study;

import java.util.*;
public class S001 {

	public static void main(String[] args) {
		//예외 - interrupt 예기치 못한 일 ,예상치 못한 일  --> 이를 위해 준비하고 있는 것이 바로 '예외처리'
		// 예외 -  exception 가벼운 오류 프로그램적으로 처리 가능 
		// 오류 -  치명적인 오류 jvm에 의존해서 처리 java에서 메모리 처리 -jvm 
		// try catch 문 , 다중try catch 문 
		// 다중 try catch 문에서는 하위가 먼저 온다. 하위 예외 객체가 위에 오고 상위 예외 객체가 밑에 온다.
		// throws예약어 - 예외전가 , 발생한 예외 객체를 양도 하는 것 
		// finally - 예외가 발생했건 안했건 무조건 수행하는거! 
		// fianl - scanner를 썼다면 닫아주는거 database에서 자주 사용된다. 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally { // 예외가 발생을 하던 안하던 실행  database처리나 file처리한다면 꼭 닫아주어야한다. 
			sc.close(); // 프로그램 종료되기 전에 닫아줌 
		}
		
	}

}
