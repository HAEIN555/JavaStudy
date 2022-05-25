package com.EX01;

class Tv {
	// 클래스의 구성요소 (속성 +메소드) 
	// 속성 (맴버 변수, 필드 )
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능(메소드)
	void power() {
		power =! power;
		//return; void면 생략가능하다 써도 되고 
		// 돌려줄 값의 반환형이 있어야한다. 
		// void앞에 public이 와도 되는데 생략 가능하다 앞에 public붙으면 매게변수?
		// 처리하게 되는 것의 결과값을 반환한다. 
		// 입력 (매게변수) ---> 출력 
		// void는 return을 생략한다. 
		//public은 메소드 앞에 많이 붙는다.
	}
	public void channelup() {
		++channel;}

	public void channeldown() {
		--channel;}
	/* 클래스로 만든 변수를 참조변수이다. 
	 *  tv라는 다른클래스로 만들어서 가지고 올 수도 있지만 한꺼번에 같이 가져올 수도 있다. 
	 */
	
	
	
	
	
}
