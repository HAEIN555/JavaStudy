package com.EX01;

public class Tvtest3 {

	public static void main(String[] args) {
	
	Tv[]	tv; // ��ü�迭�� �����ߴ�.
	tv = new Tv[5]; //tv�� ���� ������ , 5���� ��ü�迭�� �������. //�迭�� ���̸� ���ߴ�.
	//5���� �迭�� ���� �־��� �� �ִ�. 
	for (int i=0;i<tv.length;i++) {
		tv[i]=new Tv(); 
		tv[i].channel=i+10;
		// ������ 10.11.12.13.14���� ����. tv[i]��� ä�ο� 10�� �����Ѵ�.
		//System.out.println(tv[i].channel);
	}
		
	for (int i=0;i<tv.length;i++) {
		tv[i].channelup(); //tv��� �ϴ� ä���� �ø���. tv[i].channelUp() �޼ҵ带 ȣ���Ͽ� ä����1����
		System.out.printf("tv[%d].channel=%d\n",i,tv[i].channel);
	}
		
	}

}
