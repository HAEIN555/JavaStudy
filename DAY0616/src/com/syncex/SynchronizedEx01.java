package com.syncex;
/*		동기화 :  동기화는 여러명이 접근하는 것을 방지하기 위한 방법
 * 		p 767 동기화를 하기 위한 두가지 방법 
 * 		
 * 		임계영역 - 멀티 스레드에 의해서 공유된 자원이 참조 될 수 있는 코드의 범위를 의미합니다.
 * 		멀티 스레드 - 프로그램에서 임계영역을 처리한 경우 심각한 문제가 발생됩니다.
 * 		이러한 상황을 해결할 수 있는 방법이 동기화 입니다. - synchronized 
 * 
 * 		동기화를 처리하기 위해 모든 객체  락을 포함시킵니다. lock 
 * 		락 - 공유 객체에 여러 스레드가 동시에 접근 하지 못하도록 하기 위한 것입니다.
 * 			  모든 객체에 힙영역에 생성될때 자동으로 만들어지는 것을 의미합니다! 
 * 			  동기화가 잘못되면 Dead lock 이 걸립니다. Dead lock 은 이러지도 저러지도 못하는 상태
 * 		
 * 		동기화를 구현하는 2가지 방법
 * 		- public synchronized void synchronizeMethod() {}
 * 		- public void synchronizedMethod() {
 * 			synchronized(객체 또는 클래스 명){
 * 				}
 * 			} 
 * r교착상태 를 해결하기 위해서 
 * 		
 */
class ATM2 implements Runnable{

private long depositeMoney = 10000;
		
		// 추상메소드는 반드시 재정의 !!!
		@Override
		public void run() {
		// TODO Auto-generated method stub
			synchronized (this) { //this == ATM this는 클래스 명을 가르킨다. 
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
							this.notify(); // 동기화 블럭에서만 사용 가능한거다?????????????
							}
						}
					}
				}
		public long getDepositeMoney() {
			return depositeMoney;
		}
	// 출금기능
		public void withDraw(long howMuch) {
			if(getDepositeMoney()>0) {
				depositeMoney -=howMuch;
				System.out.print(Thread.currentThread().getName()+" , ");
				System.out.printf("잔액 : %d원%n",getDepositeMoney());
			}else {
				System.out.print(Thread.currentThread().getName()+",");
				System.out.println("잔액이 부족합니다.ㅜㅡㅜ");
			}
		}
	// 입금기능 
		
	}

//임계영역을 종결시킬수 있는 객체??
	class ATM implements Runnable{ // 동기화가 실행되었지만 문제가 발생했다. 
		/// 엄마만 ATM기에서 돈을 빼갔다. 
		private long depositeMoney = 10000;
		
		// 추상메소드는 반드시 재정의 !!!
		@Override
		public void run() {
		// TODO Auto-generated method stub
			synchronized (this) { //this == ATM this는 클래스 명을 가르킨다. 
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
	// 출금기능
		public void withDraw(long howMuch) {
			if(getDepositeMoney()>0) {
				depositeMoney -=howMuch;
				System.out.print(Thread.currentThread().getName()+" , ");
				System.out.printf("잔액 : %d원%n",getDepositeMoney());
			}else {
				System.out.print(Thread.currentThread().getName()+",");
				System.out.println("잔액이 부족합니다.ㅜㅡㅜ");
			}
		}
	// 입금기능 
	
	
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
