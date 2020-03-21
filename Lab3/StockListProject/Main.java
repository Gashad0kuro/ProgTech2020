import java.util.Date;

public class Main {
  public static void main(String[] args) {

    // ---------------------------Lab 2---------------------------
    /** Создаем экземпляры класса */
    /*
     * GenericItem pizza = new GenericItem("Pizza", 01, 400.00f);
     * 
     * GenericItem sandwich = new GenericItem("Sandwich", 02, 200.00f);
     * 
     * GenericItem aqua = new GenericItem("Aqua",03, 50.00f );
     * 
     * GenericItem water = new GenericItem("Water", 04, 45.00f);
     * 
     * GenericItem juice = new GenericItem("Juice",05, 100.00f );
     * 
     * GenericItem fruit_water = new GenericItem("Fruit water",06, 90.00f );
     */

    /** Связь с аналогичными товарами */
    /*
     * pizza.similar = sandwich; sandwich.similar = pizza; aqua.similar = water;
     * water.similar = aqua; juice.similar = fruit_water; fruit_water.similar =
     * juice;
     */

    /** Выводим категории */
    /*
     * pizza.category=Category.FOOD; sandwich.category=Category.FOOD;
     * aqua.category=Category.FOOD; water.category=Category.FOOD;
     * juice.category=Category.FOOD; fruit_water.category=Category.FOOD;
     */

    /**
     * Выводим данные pizza.printAll(); sandwich.printAll(); aqua.printAll();
     * water.printAll(); juice.printAll(); fruit_water.printAll();
     */

    /* Часть 2 */
    /*
     * GenericItem foodItem = new FoodItem("Fruit Nectar", 7, 12.2f, "2020-01-05",
     * (short) 12 ); foodItem.similar = juice; //foodItem.printAll();
     * 
     * GenericItem techItem = new TechnicalItem("Phone", 8, 1220.5f,(short) 2); //
     * techItem.printAll();
     * 
     * GenericItem tv = new TechnicalItem("TV", 9, 2220.5f,(short) 2); //
     * techItem.printAll();
     * 
     * 
     * GenericItem[] items = {foodItem, techItem, pizza,tv};
     * 
     * for(int i=0; i<items.length; i++){ items[i].printAll(); }
     * 
     * 
     * /*Часть 3
     */

    /*
     * GenericItem apple = new FoodItem("Apple", 10, 12.2f, "2020-01-15", (short) 12
     * ); //foodItem.printAll();
     * 
     * GenericItem pie = new FoodItem("Pie", 11, 12.2f, "2020-01-25", (short) 10 );
     * //foodItem.printAll(); System.out.println();
     * 
     * //Сравнение System.out.println(tv.equals(juice));
     */

    String line = new String();
    line = "Конфеты ’Маска’;45;120";

    String item_fld[];

    item_fld = line.split(";");
    FoodItem candy = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));

    candy.printAll();

  }
}