package com.example.atelier4.exceptions;

public class CustomerNotFoundException extends Exception {
    //si on herite de runtimeexception pour les exceptions non surveiller pour ne pas ecrire try catch dans la methode ou throws dans la methode
    // si on herite de exception on est obliger de  faire soit try catch ou throws
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
