public class TechnicalItem extends GenericItem{
    private short warrantyTime;

    TechnicalItem( String  name, int id, float price, short warrantyTime) {
      //  super(name, id, price);
        
        this.category = Category.GENERAL;
        this.warrantyTime = warrantyTime;
    }
   
 
    @Override
    public void printAll(){
        super.printAll();
        System.out.print("Warranty Time: " + warrantyTime + " ");
    }

}