package ru.billing.stocklist;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FoodItem extends GenericItem {

    private Date dateofIncome;
    private short expires;


    //Lab4 SET GET

    public void setDateofIncome(Date dateofIncome) {
        this.dateofIncome = dateofIncome;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public Date getDateofIncome() {
        return dateofIncome;
    }

    public short getExpires() {
        return expires;
    }


    //



   public FoodItem(String name, int id, float price, String dateString, short expires) {
        super(name, id, price);
        Date date;
        try {
            date = (new SimpleDateFormat("yyyy-MM-dd")).parse(dateString);
        } catch (Exception ex) {
            System.out.println("Cannot parse date");
            date = null;
        }
        this.setCategory(Category.FOOD);
        this.dateofIncome = date;
        this.expires = expires;
    }

    @Override
    public void printAll() {
        super.printAll();
        if (dateofIncome != null) {
            System.out.print("Date of income: " + (1900 + dateofIncome.getYear()) + "-" + (1 + dateofIncome.getMonth())
                    + "-" + dateofIncome.getDate() + ", Expires: " + expires + " ");
        }

        else {
            System.out.print(" Expires: " + expires + " ");

        }

    }

    // ----------------------------Лабораторная 3

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateofIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, (float) 0.0, null, null, (short) 0);
    }




}