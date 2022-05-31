package com.study;

// 실제 회원을 검색하는 기능을 구현 
public class SearchService {

	Member[] members = new Member[5];// 객체배열로 5명의 데이터를 저장할 수 있게 한다
	
	
	public SearchService() {
		// TODO Auto-generated constructor stub
		// 생성자를 호출해서 객체가 생성될때 5개의 배열로 저장하는 부분
		// members 객체 배열에 회원들의 정보를 저장
		members[0]=new Member("홍길동", 195, 120, "오나라");
		members[1]=new Member("유비", 187, 97, "한나라");
		members[2]=new Member("제갈공명", 167, 73, "제나라");
		members[3]=new Member("강감찬", 152, 58, "고려");
		members[4]=new Member("이성계", 182, 95, "고려");
	}
	// 회원의 이름을 가지고 파라미터 = 매개변수에 집어 넣는다. 그것을 찾아서 해당 회원이 있는지 없는지 
	// 회원의 이름을 매개변수로 받아서 해당 이름을 가지고 있는 회원 객체 배열에서 찾아 
	// 해당 회원의 정보를 출력하는 기능 구현 
	boolean searchMember(String name) {
		boolean searchResult = false;
		
		for(int i =0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				// 해당 이름의 회원이 찾아 졌으면 정보를 출력 
				prtInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	
	// 파라미터 값으로 회원객체의 정보를 받아서 출력하는 메소드 
	private void prtInfo(Member member){
		System.out.println(member.getName()+"으로 찾은 결과 값");
		System.out.println("이름 :"+member.getName());
		System.out.println("신장 :"+member.getHeight());
		System.out.println("몸무게:"+member.getWeight());
		System.out.println("국적 :"+member.getNation());
	}
	
}
