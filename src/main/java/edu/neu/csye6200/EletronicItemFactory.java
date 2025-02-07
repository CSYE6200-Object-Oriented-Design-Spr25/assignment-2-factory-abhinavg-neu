package edu.neu.csye6200;

public class EletronicItemFactory {
   
    private static EletronicItemFactory instance;
    private EletronicItemFactory() {

    }

    public Item createItem(String csvLine) {
        return new Item.ElectronicItem(csvLine);
    }

    public static synchronized EletronicItemFactory getInstance() {
        if (instance == null) {
            instance = new EletronicItemFactory();
        }
        return instance;
    }

}
