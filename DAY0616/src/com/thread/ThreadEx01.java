package com.thread;
// Ŭ������ ����ؼ� ������ ��� 
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
	//thread �ȿ� run �̶�� �޼ҵ� 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int start : temp) {
			try {
				sleep(500); // �ӵ� ����!  ���ڰ� ������ �������� ������ ��������
				
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("�������� �̸� :%s,",currentThread().getName()); // currentThread ���� �����ϰ� �ִ� ������ �̸�
			System.out.printf("tmep value :%d\n",start);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx01  te = new ThreadEx01("ȫ�浿");
		te.start(); // ������ �ϸ�
	}

}
