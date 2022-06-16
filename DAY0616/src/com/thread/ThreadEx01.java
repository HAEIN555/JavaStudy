package com.thread;
// 클래스를 상속해서 스레드 사용 
public class ThreadEx01 extends Thread {
	private int [] temp;
	public ThreadEx01(String threadname) {
		// TODO Auto-generated constructor stub
		super(threadname);
		temp = new int [10];
		for(int start =0;start<temp.length;start++) {
			temp[start]=start;
		}
	}
	//thread 안에 run 이라는 메소드 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int start : temp) {
			try {
				sleep(500); // 속도 조절!  숫자가 적으면 빨라지고 높으면 느려진다
				
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드의 이름 :%s,",currentThread().getName()); // currentThread 현재 진행하고 있는 스레드 이름
			System.out.printf("tmep value :%d\n",start);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx01  te = new ThreadEx01("홍길동");
		te.start(); // 시작을 하면
	}

}
