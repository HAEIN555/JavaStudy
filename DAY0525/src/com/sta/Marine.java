package com.sta;

public class Marine extends Unit {
	// �Ϲ�Ŭ���������� ��� �� ������ ���־�� �Ѵ� 
	// �߻�Ŭ���������� �ϰ� ���� �͸� �ϸ� ��
	// �߻�żҵ尡 �ִ� ���� �������̵� 
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("������ ��ġ �̵���ǥ�� x"+x+",y"+y+"�Դϴ�");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ ���� �����¿� �ֽ��ϴ�.");
	}

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message :: Standing back..");
	}
	void stimPack() {
		System.out.println("������ �������� ����մϴ�.");
	}
}