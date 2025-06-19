package org.example.exceptions.customException;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println(Account.withdraw(5000));
		} catch (InsufficientFundsException e) {
			throw new RuntimeException(e);
		}
	}
}
