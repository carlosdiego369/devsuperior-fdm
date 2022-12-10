package modulo04.capitulo07.entities;

import java.text.DecimalFormat;

public class Account {

	private int accountNumber;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int accountNumber, String holder) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public Account(int accountNumber, String holder, double inicialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(inicialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
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

	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		double rate = 5.00;
		balance -= withdraw + rate;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.00");
		return "\nAccount " 
	    + getAccountNumber() 
		+ ", Holder: " 
	    + getHolder()
		+ ", Balance: $ "
		+ df.format(getBalance());
	}
}
