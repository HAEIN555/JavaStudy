package com.utilEx;

public class StringBufferEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String buffer -- ���ڿ� ���� 
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println(sb.capacity()); //16+10 �⺻ �� 16�� 10���� ���� //26
		System.out.println(sb.length()); //10 ���̰��� 10��  10
		sb.append("ABCDEFGHIJKLMNOPQ");  //17�� 
		System.out.println(sb.capacity()); //54�� ??????? ������ ������ �ѹ� �����Ǹ� �þ�� �þ�� ��ȭ���� ����
		// �Ȱ��� ũ���� ���۸� �ϳ��� ����⶧���� �þ����!?!?!?!!?!?   26+26 ������ ���� 2��  �þ�� �þ������ŭ�� ���ϰ� 
		// �ϳ��϶��� ���� �߰������� �ʾƵ� �ȴ�. 
		// ���۰� 3��¥���� ��������� ���� ���ڶ�� ũ�⸦ �ϳ��� �ø��°Ŵϱ� 
		System.out.println(sb.length()); //27�� 
		sb.delete(1,20);
		System.out.println(sb.capacity()); // �ȿ� �ִ� �����͸� ���� �� �������� ������ �뷮�� �پ���� �ʴ´�. 
		System.out.println(sb.length());  // ���� 8 
		// String  Buffer�� DB���� ����Ѵ�. 
		sb.append("QWERTYUIOPASDFGHJKRTFFDHDDGSVFJKRASGGRRYJYKREDGFDHHDRSD");// 55�� �߰� 
		System.out.println(sb.capacity());//110
	}

}
