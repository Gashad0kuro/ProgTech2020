package ru.billing.exceptions;

public class NegativeQuantityException extends Exception {



    public NegativeQuantityException(Exception ex){
        super(ex);
    };


    public NegativeQuantityException(String msg){
       super(msg);
    };

    public String toString() {
        return ("Negative Quantity Exception Occurred: " + super.getMessage());
    }


}