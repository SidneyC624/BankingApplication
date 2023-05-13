import java.util.Scanner;

public class BankAccount {
	
	private int balance;
	private int previousTransaction;
	private String customerName;
	private String customerID;
	
	BankAccount(String cname, String cid) {
		
		this.customerName = cname;
		this.customerID = cid;
	}
	
	public void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
			previousTransaction = amount;
			System.out.println("Deposit successful");
		}
		else {
			System.out.println("Please enter a positive amount");
		}
	}
	
	public void withdraw(int amount) {
		if(amount > 0) {
			if(balance >= amount) {
				balance -= amount;
				previousTransaction = -amount;
				System.out.println("Withdraw successful");
			}
			else {
				System.out.println("Sorry, not enough money in your bank account");
			}
		}
		else {
			System.out.println("Please enter a positive amount");
		}
	}
	
	public void showPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposit: " + previousTransaction);
		}
		else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transaction occured");
		}
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
					System.out.println("================================");
					System.out.println("Balance: " + balance);
					System.out.println("================================");
					System.out.println();
					break;
					
				case 'B':
					System.out.println("================================");
					System.out.println("Enter the amount to deposit: ");
					System.out.println("================================");
					int depositAmount = scanner.nextInt();
					scanner.nextLine();
					deposit(depositAmount);
					System.out.println();
					break;
					
				case 'C':
					System.out.println("================================");
					System.out.println("Enter the amount to withdraw: ");
					System.out.println("================================");
					int withdrawAmount= scanner.nextInt();
					scanner.nextLine();
					withdraw(withdrawAmount);
					System.out.println();
					break;
					
				case 'D':
					showPreviousTransaction();
					System.out.println();
					break;
					
				case 'E':
					System.out.println("******************************");
					break;
					
				default: 
					System.out.println("Invalid option, try again");
					break;
			}
			
		}
		while(option != 'E');
		
		System.out.println("Thank you for using our service");
		
	}
}
