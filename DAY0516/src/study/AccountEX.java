package study;

public class AccountEX {

	public static void main(String[] args) {
		// 인스턴스(객체) 생성
		Account ac =new Account();
		//ac.money =10000; ac.해도 나오는게 없다 왜냐하면 account class에서 private으로 접근제한자를 걸어놔서 
		ac.setMoney(10000, "1234");
		int mypay =ac.getMoney();
		System.out.println("현재 나의 잔액"+mypay);
	}

}
