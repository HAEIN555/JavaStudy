package com.except;

public class NumExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NumberFormatException
		String [] stringNumber = {"23","12","3.141592","998"};
		int i =0;
		try {
		for(i=0;i<stringNumber.length;i++) {
			int n = Integer.parseInt(stringNumber[i]);
			System.out.println("������ȯ �� ����"+n);
		}
		}catch (NumberFormatException ne) {
			// TODO: handle exception
			System.out.println(stringNumber[i]+"�� ������ ��ȯ�� �� �����ϴ�.");
			//������ �ȳ��� �������� ������ �����ϰ� ������ ����  ����ó�� ������ ����. 
		}
	}

}
