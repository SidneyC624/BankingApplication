import java.util.Scanner;

public class BankAccount {
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	BankAccount(String cname, String cid) {
		
		this.customerName = cname;
		this.customerID = cid;
	}
	
	public void checkBalance() {
		
	}
	
	public void deposit(int amount) {
		
	}
	
	public void withdraw(int amount) {
		
	}
	
	public void previousTransaction() {
		
	}
	
	public void showMenu() {
		
		char option = ' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + this.customerName);
		System.out.println("Your ID is " + this.customerID);
		System.out.println();
		
		do {
			System.out.println("A. Check your balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Check previous transaction");
			System.out.println("E. Exit");
			System.out.println();
			System.out.println("================================");
			System.out.println("Enter an option: ");
			System.out.println("================================");
			
			option = scanner.nextLine().toUpperCase().charAt(0);
			
			switch(option) {
				case 'A':
					break;
				case 'B':
					break;
				case 'C':
					break;
				case 'D':
					break;
				case 'E':
					break;
			}
			
		}
		while(option != 'E');
		
		System.out.println("Thank you for using our service");
		
	}
}
