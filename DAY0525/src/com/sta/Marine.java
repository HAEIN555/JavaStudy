package com.sta;

public class Marine extends Unit {
	// 일반클래스에서는 모두 다 재정의 해주어야 한다 
	// 추상클래스에서는 하고 싶은 것만 하면 돼
	// 추상매소드가 있는 곳을 오버라이딩 
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("마린의 위치 이동좌표는 x"+x+",y"+y+"입니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린이 지금 대기상태에 있습니다.");
	}

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message :: Standing back..");
	}
	void stimPack() {
		System.out.println("마린이 스팀팩을 사용합니다.");
	}
}
