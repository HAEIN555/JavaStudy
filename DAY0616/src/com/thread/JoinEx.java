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
		Runnable r = new MyThread(); // �������̽��� ������ ���?
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
	// join�� �����尡 �����ʰ� �켱������ ����ǰ� ���ش� ���κ��� ���� ���� �� �ְ� 
	
