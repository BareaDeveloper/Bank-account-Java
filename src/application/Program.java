package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account acc;

		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);

		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			acc = new Account(accNumber, name, sc.nextDouble());
		} else {
			acc = new Account(accNumber, name);
		}

		System.out.println("\nAccount data:");
		System.out.println(acc);

		System.out.print("Enter a deposit value: ");
		acc.deposit(sc.nextDouble());

		System.out.println("Updated account data:");
		System.out.println(acc);

		System.out.print("Enter a withdraw value: ");
		acc.withdraw(sc.nextDouble());

		System.out.println("Updated account data:");
		System.out.println(acc);

		sc.close();

	}

}
