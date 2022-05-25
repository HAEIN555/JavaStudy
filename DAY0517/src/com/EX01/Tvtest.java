package com.EX01;

public class Tvtest/* extends Tv*/ { // 상속해준다...? 
	// 클래스명에서 확장시켜서 가져올 수도 있고 ????????????

	public static void main(String[] args) {// main 메소드이기때문에 실행 메소드입니다. 
		Tv t; // Tv인스턴스를 참조하기 위한 변수 t를 생성한다. 
		t= new Tv();//인스턴스를 생성했다. (인스턴스는 객체와 똑같다. ) 
		//맴버변수와 메소를 접근해서 tv를 사용한다. 
		// 사용할때는 . 연산자를 사용한다. 
		//t. 이라고 치면 Tv안에 들어간 도구 메소드들을 사용할 수 있다. 
		t.channel=24;// tv라고 하는 멤버 변수 채널 값을 24로 지정했다.  // YTN
		t.channeldown();// 채널을 내리기위한 기능을 호출한다. //23번 연합뉴스
		System.out.println("현재 채널은 "+t.channel+"입니다.");
	}
	
	/* 상속에 의해서 나온 친구들?
	 * @Override public void channeldown() { super.channeldown(); }
	 */
}
