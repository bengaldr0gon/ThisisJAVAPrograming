package ch06.practice;

public class Account {
	public static int MIN_BALANCE = 0;
	public static int MAX_BALANCE = 1000000;
	
	private int balance = 0;;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance && MAX_BALANCE>=balance) {
			this.balance = balance;
		} else {
			
		}
	}
	

}
