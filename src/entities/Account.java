package entities;

public class Account {

	private static final double WITHWRAW_TAX = 5.00;
	
	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) { 
		balance -= amount + WITHWRAW_TAX;
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f%n", number, holder, balance); 
	}
	
}
