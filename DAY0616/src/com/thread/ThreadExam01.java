package com.thread;
class ThreadEx03 extends Thread{
	
	@Override
	public void run() {
	for(char ch ='A';ch<'z';ch++) {
		System.out.println(ch);
		try {
			Thread.sleep(150);
		} catch (InterruptedException ie) {
			// TODO: handle exception
			ie.printStackTrace();
			}
		}	
	}
	
}
public class ThreadExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadEx03 t = new ThreadEx03();
		t.start();
 		
		
		  for(int i =1;i<60;i++) { System.out.println(i); try { Thread.sleep(150); }
		  catch (InterruptedException ie) { 
		  ie.printStackTrace(); } }
		 // 메인이 가지고 있는 숫자가 먼저찍힌다!  thread 클래스보다 메인이 먼저 움직인다. 
		 // 메인이 종료가 되어야지만 다 종료된다. 메인은 실행클래스니까!!!!!!!!!  만약 속도조절한다면 바귈 수도 이따
	}

}
