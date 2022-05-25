package Com.method_;

public class OverloadingEX02 {
	// 메소드 내에서 메소드 호출 
	
	
	public void getLength(int n) {
		String s = String.valueOf(n);//4
		getLength(s);
	}/*
	public void getLength(int n,int n2) {
		
	}*/
	 void getLength(float n) {
		 String s = String.valueOf(n);
			getLength(s);
	}
	private int getLength(String str) {
		System.out.println("값의 길이를 구해본다"+str.length());
		
		return 0;
	}
	public static void main(String[] args) {
		
		OverloadingEX02 oe2 =new OverloadingEX02();
		oe2.getLength(1000);
		oe2.getLength(3.14f);
		oe2.getLength(100000);
	}

}
