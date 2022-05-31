package com.study;
import java.util.*;
public class SearchMain {

	// 이름을 파라미터로 하여 검색하는 프로그램 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//searchMember 호출하기 위해 객체 만들어줌!
		SearchService ssv = new SearchService();
		
		do {
			System.out.print("검색 회원 이름 입력 :");
			String name = sc.next();
			
			boolean searchResult = ssv.searchMember(name);
			if(searchResult) break; // 찾으면 끝난거니까 
			System.out.println("해당 회원이 존재 하지않습니다.");
		} while (true);
	}

}
