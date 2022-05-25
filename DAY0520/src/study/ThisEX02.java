package study;

public class ThisEX02 {
	
	int aa;
	
	public ThisEX02(int a) {
		this.aa =a;
	}
	
	public void set(int aa) {
		this.aa = aa;
	}


	public static void main(String[] args) {
		ThisEX02 t1 =new ThisEX02(1);
		ThisEX02 t2 =new ThisEX02(1);
		ThisEX02 t3 =new ThisEX02(1);
		
		t1.set(4);
		t2.set(5);
		t3.set(6);
		
	}

}
