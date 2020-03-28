package ru.billing.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.ItemCatalog;

public class CatalogFileLoader implements CatalogLoader {

    private String fileName;

    public CatalogFileLoader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void load(ItemCatalog catalog) throws CatalogLoadException {
        File f = new File(fileName);

        String line;
        try (FileInputStream fis = new FileInputStream(f); Scanner scanner = new Scanner(fis);) {

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (line.length() == 0)
                    break;
                String[] item_fld = line.split(";");
                String name = item_fld[0];
                float price = Float.parseFloat(item_fld[1]);
                short expires = Short.parseShort(item_fld[2]);
                FoodItem item = new FoodItem(name, price, null, new java.util.Date(), expires);
                catalog.addItem(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }

}
