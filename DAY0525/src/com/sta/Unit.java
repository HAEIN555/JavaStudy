package com.sta;

public abstract class Unit { // 추상클래스 : 공통적인 기능만 모아서 만듦
	int x, y;
	
	abstract void  move(int x,int y);
	abstract void  stop();
	abstract void  message();

}
