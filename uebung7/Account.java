package uebung7;

public class Account {
	private double balance;
	private String name;
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void withdrawal(double w) {
		this.balance -= w;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
