package com.thread;
// 클래스 만들기 전에 인터페이스 Runnable을 가져와서 클래스 만듬
public class ThreadEx02 implements Runnable {
	
	private int [] temp;
	
	public ThreadEx02() {
		// TODO Auto-generated constructor stub
		
		temp = new int [10];
		for(int start =0;start<temp.length;start++) {
			temp[start]=start;
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int start : temp) {
			try {
				Thread.sleep(500); // 속도 조절!  숫자가 적으면 빨라지고 높으면 느려진다
				
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드의 이름 :%s,",Thread.currentThread().getName()); // currentThread 현재 진행하고 있는 스레드 이름
			System.out.printf("tmep value :%d\n",start);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx02 te2 = new ThreadEx02();
		// 인터페이스라서 새로운 객체 만들어주어야함 
		Thread t = new Thread(te2, "구준표");
		t.start();
	}

}
