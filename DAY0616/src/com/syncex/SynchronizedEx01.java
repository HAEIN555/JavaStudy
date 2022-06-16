package com.syncex;
/*		����ȭ :  ����ȭ�� �������� �����ϴ� ���� �����ϱ� ���� ���
 * 		p 767 ����ȭ�� �ϱ� ���� �ΰ��� ��� 
 * 		
 * 		�Ӱ迵�� - ��Ƽ �����忡 ���ؼ� ������ �ڿ��� ���� �� �� �ִ� �ڵ��� ������ �ǹ��մϴ�.
 * 		��Ƽ ������ - ���α׷����� �Ӱ迵���� ó���� ��� �ɰ��� ������ �߻��˴ϴ�.
 * 		�̷��� ��Ȳ�� �ذ��� �� �ִ� ����� ����ȭ �Դϴ�. - synchronized 
 * 
 * 		����ȭ�� ó���ϱ� ���� ��� ��ü  ���� ���Խ�ŵ�ϴ�. lock 
 * 		�� - ���� ��ü�� ���� �����尡 ���ÿ� ���� ���� ���ϵ��� �ϱ� ���� ���Դϴ�.
 * 			  ��� ��ü�� �������� �����ɶ� �ڵ����� ��������� ���� �ǹ��մϴ�! 
 * 			  ����ȭ�� �߸��Ǹ� Dead lock �� �ɸ��ϴ�. Dead lock �� �̷����� �������� ���ϴ� ����
 * 		
 * 		����ȭ�� �����ϴ� 2���� ���
 * 		- public synchronized void synchronizeMethod() {}
 * 		- public void synchronizedMethod() {
 * 			synchronized(��ü �Ǵ� Ŭ���� ��){
 * 				}
 * 			} 
 * r�������� �� �ذ��ϱ� ���ؼ� 
 * 		
 */
class ATM2 implements Runnable{

private long depositeMoney = 10000;
		
		// �߻�޼ҵ�� �ݵ�� ������ !!!
		@Override
		public void run() {
		// TODO Auto-generated method stub
			synchronized (this) { //this == ATM this�� Ŭ���� ���� ����Ų��. 
				for(int i=0;i<10;i++) {
					if(getDepositeMoney()<=0) 
						break;	
					withDraw(1000);
					if(getDepositeMoney()==2000||getDepositeMoney()==4000
							||getDepositeMoney()==6000||getDepositeMoney()==8000) {
							try {
								this.wait();
							}catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
									}
								}else {
							this.notify(); // ����ȭ �������� ��� �����ѰŴ�?????????????
							}
						}
					}
				}
		public long getDepositeMoney() {
			return depositeMoney;
		}
	// ��ݱ��
		public void withDraw(long howMuch) {
			if(getDepositeMoney()>0) {
				depositeMoney -=howMuch;
				System.out.print(Thread.currentThread().getName()+" , ");
				System.out.printf("�ܾ� : %d��%n",getDepositeMoney());
			}else {
				System.out.print(Thread.currentThread().getName()+",");
				System.out.println("�ܾ��� �����մϴ�.�̤Ѥ�");
			}
		}
	// �Աݱ�� 
		
	}

//�Ӱ迵���� �����ų�� �ִ� ��ü??
	class ATM implements Runnable{ // ����ȭ�� ����Ǿ����� ������ �߻��ߴ�. 
		/// ������ ATM�⿡�� ���� ������. 
		private long depositeMoney = 10000;
		
		// �߻�޼ҵ�� �ݵ�� ������ !!!
		@Override
		public void run() {
		// TODO Auto-generated method stub
			synchronized (this) { //this == ATM this�� Ŭ���� ���� ����Ų��. 
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					if(getDepositeMoney()<=0) 
						break;	
					withDraw(1000);
				}
			}
		}
		public long getDepositeMoney() {
			return depositeMoney;
		}
	// ��ݱ��
		public void withDraw(long howMuch) {
			if(getDepositeMoney()>0) {
				depositeMoney -=howMuch;
				System.out.print(Thread.currentThread().getName()+" , ");
				System.out.printf("�ܾ� : %d��%n",getDepositeMoney());
			}else {
				System.out.print(Thread.currentThread().getName()+",");
				System.out.println("�ܾ��� �����մϴ�.�̤Ѥ�");
			}
		}
	// �Աݱ�� 
	
	
	}
public class SynchronizedEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ATM  atm = new ATM();
		//Thread mother = new Thread(atm, "mother");
		//Thread son = new Thread(atm, "son");
		
		//mother.start();
		//son.start();
		
		ATM2  atm2 = new ATM2();
		Thread mother2 = new Thread(atm2, "mother2");
		Thread son2 = new Thread(atm2, "son2");
		
		mother2.start();
		son2.start();
	}

}
