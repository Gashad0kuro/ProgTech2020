package ru.billing.exceptions;

public class CatalogLoadException extends Exception {


    public CatalogLoadException(Exception ex){
        super(ex);
    };

    public CatalogLoadException(String msg){
       super(msg);
    };

    public String toString() {
        return ("Catalog Exception Occurred: " + super.getMessage());
    }


}