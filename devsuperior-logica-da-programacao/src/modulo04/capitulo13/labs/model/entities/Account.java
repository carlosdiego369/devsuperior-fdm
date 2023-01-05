package modulo04.capitulo13.labs.model.entities;

import java.text.DecimalFormat;

import modulo04.capitulo13.labs.model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public static DecimalFormat df = new DecimalFormat("##0.00");
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

//	public void setBalance(Double balance) {
//		this.balance = balance;
//	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

//	public void setWithdrawLimit(Double withdrawLimit) {
//		this.withdrawLimit = withdrawLimit;
//	}
	
	public void deposit(Double amount) {
		amount += balance;
	}
	
	public void withdraw(Double amount) {
		
		if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		if(amount > balance) {
			throw new DomainException("Not enough balance");
		}
		
//		if(amount < balance && amount < withdrawLimit) {
//			balance -= amount;
//			
//		}
		
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New balance: " + df.format(balance);
	}
}
