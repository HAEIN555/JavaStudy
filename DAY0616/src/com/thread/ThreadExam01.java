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
		 // ������ ������ �ִ� ���ڰ� ����������!  thread Ŭ�������� ������ ���� �����δ�. 
		 // ������ ���ᰡ �Ǿ������ �� ����ȴ�. ������ ����Ŭ�����ϱ�!!!!!!!!!  ���� �ӵ������Ѵٸ� �ٱ� ���� �̵�
	}

}
