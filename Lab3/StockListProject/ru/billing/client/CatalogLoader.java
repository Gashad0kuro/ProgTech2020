package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.stocklist.ItemCatalog;

// ---------------- Задание для 4ей лабораторной-----------------------------
//Добавили исключение (5я лаб)
public interface CatalogLoader{

    public void load  (ItemCatalog catalog)throws CatalogLoadException;
    


    
}