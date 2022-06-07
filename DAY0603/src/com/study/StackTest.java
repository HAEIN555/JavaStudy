package com.study;

import java.util.Stack;

public class StackTest {

	private static final String colors[]= {
			"검정","노랑","녹색","청색","빨강","연두색"}; //큐와 스택은 입출력 방식이 다르다(입력방식/출력방식) / 큐 : 먼저 들어가면 먼저 나온다 / 스택 : 마지막에 들어간 데이터가 제일 먼저 나온다.
	
	
	public StackTest() {
		
		Stack<String> st= new Stack<>();
	
		for(String color : colors) 
			st.push(color);
			popStack(st);
		}
	
	public void popStack(Stack<String>st){
		System.out.println("pop:");
		//스택이 비어 있지 않으면 
		//pop 해라
		while (!st.empty()) {
			System.out.println(st.pop());
		}
	}
	
	
	
	public static void main(String[] args) {
		new StackTest();
	}

}
