package com.study;


class Box<T>{ // T : 타입을 말함
	private T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class GenericEx01 {

	public static void main(String[] args) {
		
		Box <Integer> bi = new Box<Integer>();
		bi.setT(100);
		System.out.println(bi.getT());
	
		Box <String> bs = new Box<String>();
		bs.setT("홍길동");
		System.out.println(bs.getT());

		Box<Integer> bit ;
		bit = createBox();
		
		
	}

	static Box createBox() {
		return new Box();
	}

}
