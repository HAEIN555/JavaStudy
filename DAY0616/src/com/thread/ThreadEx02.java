package com.thread;
// Ŭ���� ����� ���� �������̽� Runnable�� �����ͼ� Ŭ���� ����
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
				Thread.sleep(500); // �ӵ� ����!  ���ڰ� ������ �������� ������ ��������
				
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("�������� �̸� :%s,",Thread.currentThread().getName()); // currentThread ���� �����ϰ� �ִ� ������ �̸�
			System.out.printf("tmep value :%d\n",start);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx02 te2 = new ThreadEx02();
		// �������̽��� ���ο� ��ü ������־���� 
		Thread t = new Thread(te2, "����ǥ");
		t.start();
	}

}
