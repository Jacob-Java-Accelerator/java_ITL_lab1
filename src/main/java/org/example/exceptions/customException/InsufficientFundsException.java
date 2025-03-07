package org.example.exceptions.customException;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(){
        super("Insufficient funds in account");
    }

    public InsufficientFundsException(String message){
        super(message);
    }

}
