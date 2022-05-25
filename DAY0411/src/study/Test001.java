package study;

import java.util.Scanner;

//import  java.util.Scanner;
	// java util에서 scanner을 가져온다. 외부에서 기능을 가져와서 쓰려고 할때 api를 이용
	// 범퍼드 리드와 스캐너를 사용해서 입력을 받은걸을 컴퓨터로 저장할때 사용 한다. 
	// 유틸리디에서 가져와서 쓴다는 구문 
	// import 외부에 있는것을 가져온다. export 내부에 있는것을 외부에 보낸다.
	// 백업을 할때는 export 복원을 할때는 import 를 사용한다.
	
public class Test001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 스캐너로 객체를 만드는 것 Scanner 으로 sc를 만든다.
		// 스캐너를 입력하는 것 시스템에서 가져오기 
		System.out.println("임의의 정수를 입력하세요");
		// 안내 멘트
		int a = Integer.parseInt(sc.next());
		// 문자열로 들어온 문자를 인트로 바꾸어 준다. 
		// 임의의 수를 입력받아 정수형으로 파싱하시오
		// 파싱에 값을 입력넣어주어서 int a에 대입시켜주는 거 
		System.out.println(a);
		//스캐너로 받은 수를 다시 출력하는 것 
		 
	
	}
}
