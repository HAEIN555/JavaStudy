package Com.method_;

public class OverloadingEX02 {
	// �޼ҵ� ������ �޼ҵ� ȣ�� 
	
	
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
		System.out.println("���� ���̸� ���غ���"+str.length());
		
		return 0;
	}
	public static void main(String[] args) {
		
		OverloadingEX02 oe2 =new OverloadingEX02();
		oe2.getLength(1000);
		oe2.getLength(3.14f);
		oe2.getLength(100000);
	}

}
