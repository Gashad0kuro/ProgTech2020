package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {
    private short warrantyTime;

   public TechnicalItem( String  name, int id, float price, short warrantyTime) {
      //  super(name, id, price);
        
        this.setCategory(Category.GENERAL); 
        this.warrantyTime = warrantyTime;
    }

    //Added SET GET - Lab4
    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }
    
    public short getWarrantyTime() {
        return warrantyTime;
    }
   //
 
    @Override
    public void printAll(){
        super.printAll();
        System.out.print("Warranty Time: " + warrantyTime + " ");
    }

}