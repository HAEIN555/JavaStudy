package com.sta;

public class SingleTank extends Unit {

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Move it! Move it! SingleTank ===> x:"+x+",y"+y);
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Destination?");
		
	}

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message :: Go,Siege!!!");
	}
	
	void changeMode() {
		System.out.println("YES,Sir!");
	}

}
