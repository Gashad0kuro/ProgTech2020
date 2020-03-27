package ru.billing.stocklist;

public class GenericItem {

    private int ID; // ID товара
    private String name; // Наименование товара
    private float price; // Цена товара
    private GenericItem similar = null;
    private Category category = Category.GENERAL;

    // SET GET LAB4

    public void setID(int iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSimilar(GenericItem similar) {
        this.similar = similar;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public GenericItem getSimilar() {
        return similar;
    }

    public Category getCategory() {
        return category;
    }
    //

    public GenericItem(String name, int id, float price) {
        this.ID = id;
        this.name = name;
        this.price = price;
    }

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

    // ---------------- Задание для 4ей лабораторной-----------------------------

    @Override
    public String toString() {
        String frase = new String();

        frase = ("ID: " + ID + ", Name: " + name + ", price: " + price + ", similar: "
                + (similar != null ? similar.name : "null") + ", category: " + category.name() + "");
        return frase;
    }

}
