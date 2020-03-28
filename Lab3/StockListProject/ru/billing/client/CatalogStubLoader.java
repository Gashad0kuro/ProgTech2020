package ru.billing.client;

import java.util.Date;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.Category;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

// ---------------- Задание для 4ей лабораторной-----------------------------
//Добавили исключение (5я лаб)
public class CatalogStubLoader implements CatalogLoader {

    public void load(ItemCatalog catalog) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, null, new Date(), (short) 10);

        try{
        catalog.addItem(item1);
        catalog.addItem(item2);  
        //exception test
        catalog.addItem(item2);

        } catch (ItemAlreadyExistsException e){
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
        
    }
}