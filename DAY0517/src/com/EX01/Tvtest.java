package com.EX01;

public class Tvtest/* extends Tv*/ { // ������ش�...? 
	// Ŭ�������� Ȯ����Ѽ� ������ ���� �ְ� ????????????

	public static void main(String[] args) {// main �޼ҵ��̱⶧���� ���� �޼ҵ��Դϴ�. 
		Tv t; // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� �����Ѵ�. 
		t= new Tv();//�ν��Ͻ��� �����ߴ�. (�ν��Ͻ��� ��ü�� �Ȱ���. ) 
		//�ɹ������� �޼Ҹ� �����ؼ� tv�� ����Ѵ�. 
		// ����Ҷ��� . �����ڸ� ����Ѵ�. 
		//t. �̶�� ġ�� Tv�ȿ� �� ���� �޼ҵ���� ����� �� �ִ�. 
		t.channel=24;// tv��� �ϴ� ��� ���� ä�� ���� 24�� �����ߴ�.  // YTN
		t.channeldown();// ä���� ���������� ����� ȣ���Ѵ�. //23�� ���մ���
		System.out.println("���� ä���� "+t.channel+"�Դϴ�.");
	}
	
	/* ��ӿ� ���ؼ� ���� ģ����?
	 * @Override public void channeldown() { super.channeldown(); }
	 */
}
