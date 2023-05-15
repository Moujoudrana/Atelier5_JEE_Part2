package com.example.atelier4.exceptions;

public class BankAccountNotFoundException extends Exception {

    public BankAccountNotFoundException(String message){
        super(message);
    }
}
