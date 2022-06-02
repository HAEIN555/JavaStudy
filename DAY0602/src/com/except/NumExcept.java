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
			System.out.println("정수변환 된 값은"+n);
		}
		}catch (NumberFormatException ne) {
			// TODO: handle exception
			System.out.println(stringNumber[i]+"은 정수로 변환할 수 없습니다.");
			//에러를 안내는 목적으로 문장을 안전하게 끝내기 위해  예외처리 구문을 쓴다. 
		}
	}

}
