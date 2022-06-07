package com.study;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	private static final String colors[]= {
			"����","���","���","û��","����","���λ�"};
	
	
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();
		
		for(String color : colors) {
			qu.offer(color);
		}
		
		while(qu.peek()!=null) {
			System.out.println(qu.poll());
		}

	}

}
