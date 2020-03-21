
public class GenericItem {

    private int ID; // ID товара
    private String name; // Наименование товара
    private float price; // Цена товара
    GenericItem similar = null;
    Category category = Category.GENERAL;

    /*
     * ublic GenericItem(String name, int id, float price) { this.ID = id; this.name
     * = name; this.price = price; }
     */

    @Override
    public boolean equals(Object obj) {

        return (obj == this || this.getClass().getMethods() == obj.getClass().getMethods()
                || this.hashCode() == obj.hashCode());

        // return this == obj ;
    }

    @Override
    public int hashCode() {
        return ((ID + (int) price + name.hashCode()) * (category.hashCode() + 1));

    }

    // ---------------- Задание для 3ей лабораторной-----------------------------
    public GenericItem(String name, float price, Category category) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.similar = analog;
        this.name = name;
        this.price = price;
        this.ID = GenericItem.currentID++;
    }

    public void printAll() {
        System.out.printf("\nID: %d, Name: %-15s, price: %5.2f, similar: %-15s, category: %-8s, ", ID, name, price,
                similar != null ? similar.name : "null", category.name());
    }

    static int currentID = 11;

}
