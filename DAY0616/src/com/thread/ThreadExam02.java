package com.thread;

class ThreadEx04 extends Thread{
	
	private String firstname;
	private String lastname;
	
	public ThreadEx04(String a,String b,int x) {
		// TODO Auto-generated constructor stub
		firstname = a;
		lastname= b;
		setPriority(x);
		setDaemon(true); // 데몬 스레드인지 확인하는 boolean 값 변환 메인이 종료되어도 살아있는 것이 데몬
	}
	@Override
	public void run() {	
		System.out.println(Thread.activeCount()); // 살아있는지 확인 
		int xx = Thread.activeCount();
		Thread [] th = new Thread[xx];
		Thread.enumerate(th);
		
		for(int i =0;i<th.length;i++) {
			System.out.println(th[i].getName()+":"+
					th[i].getPriority()+":"+th[i].isDaemon()+":"+th[i].isAlive());
		}
		while(true)  {
			System.out.println("이름"+firstname);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("이름2"+lastname);
		}
	}	
}
public class ThreadExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx04 t1 = new ThreadEx04("길동", "홍", 1);
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception	
		}
		ThreadEx04 t2 = new ThreadEx04("유신", "김", 5);
		t2.start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
