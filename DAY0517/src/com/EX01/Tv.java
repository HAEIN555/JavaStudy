package com.EX01;

class Tv {
	// Ŭ������ ������� (�Ӽ� +�޼ҵ�) 
	// �Ӽ� (�ɹ� ����, �ʵ� )
	String color;
	boolean power;
	int channel;
	
	// Tv�� ���(�޼ҵ�)
	void power() {
		power =! power;
		//return; void�� ���������ϴ� �ᵵ �ǰ� 
		// ������ ���� ��ȯ���� �־���Ѵ�. 
		// void�տ� public�� �͵� �Ǵµ� ���� �����ϴ� �տ� public������ �ŰԺ���?
		// ó���ϰ� �Ǵ� ���� ������� ��ȯ�Ѵ�. 
		// �Է� (�ŰԺ���) ---> ��� 
		// void�� return�� �����Ѵ�. 
		//public�� �޼ҵ� �տ� ���� �ٴ´�.
	}
	public void channelup() {
		++channel;}

	public void channeldown() {
		--channel;}
	/* Ŭ������ ���� ������ ���������̴�. 
	 *  tv��� �ٸ�Ŭ������ ���� ������ �� ���� ������ �Ѳ����� ���� ������ ���� �ִ�. 
	 */
	
	
	
	
	
}
