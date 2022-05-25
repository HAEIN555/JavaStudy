package study2;

public class account {
	private String name; // 예금주
	private long balance ; // 잔고
	
	public account () {}
	public account(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	// 입금
	public void deposit(long amount) {
		balance += amount;// 잔고에 계속 누적을 시켜야하니까 
	}
	
	// 출금
	public void withdraw(long amount){
		if(balance <amount) {
			System.out.println("잔액이 부족합니다.");}
			
		else {balance -= amount; // 잔고에서 빼야하니까}
			}
		}
		
	}
	
	
	
	
	
	
	
	

