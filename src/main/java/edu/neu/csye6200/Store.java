package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
public class Store extends AbstractStore {
   
    EletronicItemFactory eletronicItemFactory = EletronicItemFactory.getInstance();
    FoodItemFactory foodItemFactory = new FoodItemFactory();
    ServiceItemFactory serviceItemFactory = ServiceItemFactory.getInstance();

    List<Item> items = new ArrayList<>();
    public void demo() {
        System.out.println("Store demo");
        FileUtil fileUtil = new FileUtil();
        try {
            BufferedReader reader = fileUtil.readFile("src/main/java/edu/neu/csye6200/items.txt");
            String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data[0].equals("Food")) {
                Item item = foodItemFactory.createItem(line);
                items.add(item);
            } else if (data[0].equals("Electronic")) {
                Item item = eletronicItemFactory.createItem(line);
                items.add(item);
            } else if (data[0].equals("Service")) {
                Item item = serviceItemFactory.createItem(line);
                items.add(item);
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // print items
        System.out.println("Printing items");
        for (Item item : items) {
            System.out.println(item.toString());
        }
        System.out.println("Sorting items by price");
        sortByPrice();
        System.out.println("Printing items after sorting by price");
        for (Item item : items) {
            System.out.println(item.toString());
        }
        System.out.println("Sorting items by name");
        sortByName();
        System.out.println("Printing items after sorting by name");
        for (Item item : items) {
            System.out.println(item.toString());
        }
        System.out.println("Sorting items by ID");
        sortByID();
        System.out.println("Printing items after sorting by ID");
        for (Item item : items) {
            System.out.println(item.toString());
        }
        
    }

    public void sortByPrice() {
    Collections.sort(items, new Comparator<Item>() {
        public int compare(Item item1, Item item2) {
            return Double.compare(item1.price, item2.price);
        }
    });
    }

    public void sortByName() {
        Collections.sort(items, new Comparator<Item>() {
            public int compare(Item item1, Item item2) {
                return item1.name.compareTo(item2.name);
            }
        });
    }

    public void sortByID() {
        Collections.sort(items, new Comparator<Item>() {
            public int compare(Item item1, Item item2) {
                return item1.ID.compareTo(item2.ID);
            }
        });
    }
}
