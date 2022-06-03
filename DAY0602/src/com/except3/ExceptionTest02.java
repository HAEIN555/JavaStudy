package com.except3;

public class ExceptionTest02 {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
			
		int x =100;
		int y =0;
		int tot= 0;
		try {
			tot = x/y;
		}catch(ArithmeticException ar) {
		
			Myexception me = new Myexception("³ª´°¼À",ar);
			//throw me;
			me.printStackTrace();
		}
		System.out.println("tot :"+tot);
	}

}
