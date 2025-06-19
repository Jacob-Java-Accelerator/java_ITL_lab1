package org.example.exceptions.customException;

public class Account {

    public static int withdraw(int amount) throws InsufficientFundsException {
        int balance = 1000;
        if(amount> balance){
            throw new InsufficientFundsException();
        }
		return balance - amount;
    }
}
