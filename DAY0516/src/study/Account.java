package study;

public class Account {

	private int money;

	
	// 뭔지는 모르겠지만 getter와 setter를 가지고 오는 건 alt shift s에서 getter setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money,String pass) {
		if(pass.equals("1234"))
			this.money = money;
		// setter
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
