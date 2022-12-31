package modulo04.capitulo12.application;

import modulo04.capitulo12.entities.Account;
import modulo04.capitulo12.entities.BusinessAccount;
import modulo04.capitulo12.entities.SavingsAccount;

public class AccountApplication {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

//		 UPCASTING

		@SuppressWarnings("unused")
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

//		 DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

//		BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(500.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc6 = new Account(1005, "Alex", 1000.0);
		acc6.withdraw(200.0);
		
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1006, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.0);
		
		System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAccount(1007, "Bob", 1000.0, 500.0);
		acc8.withdraw(200.0);
		
		System.out.println(acc8.getBalance());
		
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}
