package com.except;
public class Except02 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//throws new Exception(); // ���� ���� 
		// throw : ���ܸ� ������ �߻���Ŵ 
						// throw new �߻���ų ���� ��ü�� ������ 
		// ���� ���� 
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(0/0); 
		// ���� �����̵��� 4�� ������ ���� �׷��� �ٽ� ����ó�� ������ �ۼ����ش�.
		System.out.println(4);
		}catch (ArithmeticException xe) {
			// TODO: handle exception
			//exception�� �߻��Ҷ����� ��� �����ϴ� 
			System.out.println(5);
		}
		//System.out.println(1/0); // ��� ������ �߻��ϸ� ����ó���� �۵�! 
		catch(Exception e) {
			// TODO: handle exception
			//exception�� �߻��Ҷ����� ��� �����ϴ� 
			System.out.println(5);
			}
		System.out.println(6);
		
	}
}
