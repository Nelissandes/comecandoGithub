package aplication;

import java.util.Locale;
import java.util.Scanner;
import entite.Account;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account Account;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char initialValue = sc.next().charAt(0);
		
		if (initialValue == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			Account = new Account (number, holder, initialDeposit);
		}
		
		else {
			Account = new Account (number, holder);	
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.print(Account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double deposit = sc.nextDouble();
		Account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.print(Account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		Account.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.print(Account.toString());
		
		
    sc.close();
	}

}
