package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

import ru.billing.exceptions.ItemAlreadyExistsException;

public class ItemCatalog {

    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();


    //SET GET

    public void setALCatalog(ArrayList<GenericItem> aLCatalog) {
        ALCatalog = aLCatalog;
    }

    public void setCatalog(HashMap<Integer, GenericItem> catalog) {
        this.catalog = catalog;
    }


    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }
    
    public HashMap<Integer, GenericItem> getCatalog() {
        return catalog;
    }

    //

    

    // Добавляет товар
    public void addItem (GenericItem item) throws ItemAlreadyExistsException {
       if(catalog.containsKey(item.getID())) throw new ItemAlreadyExistsException("Item with ID: "+ item.getID()+" already in catalog!");
       
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }

    // Выводит каталог
    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i.toString());
        }
    }

    // Поиск по id в Hasmap
    public GenericItem findItemByID(int id) {
        if (!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    // Поиск по id в ArrayList
    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id)
                return i;
        }
        return null;
    }


    

}