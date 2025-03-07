package org.example.exceptions.customException;

public class Account {

    public void withdraw(int amount) throws InsufficientFundsException {
        int balance = 1000;
        if(amount> balance){
            throw new InsufficientFundsException();
        }
        int i = balance - amount;
    }
}
