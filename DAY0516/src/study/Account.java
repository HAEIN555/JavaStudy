package study;

public class Account {

	private int money;

	
	// ������ �𸣰����� getter�� setter�� ������ ���� �� alt shift s���� getter setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money,String pass) {
		if(pass.equals("1234"))
			this.money = money;
		// setter
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
