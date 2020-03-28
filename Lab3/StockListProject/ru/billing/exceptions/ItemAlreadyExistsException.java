package ru.billing.exceptions;

public class ItemAlreadyExistsException extends Exception {


    public ItemAlreadyExistsException(Exception ex){
        super(ex);
    };


    public ItemAlreadyExistsException(String msg){
       super(msg);
    };

    public String toString() {
        return ("Item Already Exists: " + super.getMessage());
    }


}