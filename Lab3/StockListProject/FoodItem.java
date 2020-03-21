
import java.util.Date;
import java.text.SimpleDateFormat;

public class FoodItem extends GenericItem {

    private Date dateofIncome;
    private short expires;

   /* FoodItem(String name, int id, float price, String dateString, short expires) {
        super(name, id, price);
        Date date;
        try {
            date = (new SimpleDateFormat("yyyy-MM-dd")).parse(dateString);
        } catch (Exception ex) {
            System.out.println("Cannot parse date");
            date = null;
        }
        this.category = Category.FOOD;
        this.dateofIncome = date;
        this.expires = expires;
    }*/

    @Override
    public void printAll() {
        super.printAll();
        System.out.print("Date of income: " + (1900 + dateofIncome.getYear()) + "-" + (1 + dateofIncome.getMonth())
                + "-" + dateofIncome.getDate() + ", Expires: " + expires + " ");
    }

    // Лабораторная 3

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateofIncome = date;
    }

    public FoodItem(String name, float price, short expires){
        this(name,price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, (float) 0.0, null, null, (short) 0);
    }

}