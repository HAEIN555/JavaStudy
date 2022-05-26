package HW2;

public interface IRF { // 인터 페이스 인터페이스 안에는 상수와 추상 메소드만이 가능 

		abstract void wconnect();
	
		abstract void wdisconnect();
		
		String RF_Type_IR = "적외선"; // 상수 
		String RF_Type_BT = "블루투스";
}
