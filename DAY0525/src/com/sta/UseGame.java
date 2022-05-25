package com.sta;

public class UseGame {

	public static void main(String[] args) {
		
		Unit[] u=new Unit[3];
		u[0] =new Marine();
		u[1] =new SingleTank();
		u[2] =new Dropship();
		
		for(int i =0;i<u.length;i++) {
			System.out.println("==================================");
			// 모든 유닛을 같은 위치로 이동시켜라.
			u[i].move(100, 200);
			u[i].message();
			System.out.println("==================================");
		}
	}

}
