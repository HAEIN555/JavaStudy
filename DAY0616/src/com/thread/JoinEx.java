package com.thread;

	class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
		first();
	}
	public void first() {
	System.out.println("first");
	second();
	}
	public void second() {
	System.out.println("second");
		}
	}
	public class JoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"start");
		Runnable r = new MyThread(); // 인터페이스의 다형성 사용?
		Thread myThread = new Thread(r);
		myThread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"end");
		}
	}
	// join은 스레드가 죽지않게 우선적으로 실행되게 해준다 메인보다 먼저 끝날 수 있게 
	
