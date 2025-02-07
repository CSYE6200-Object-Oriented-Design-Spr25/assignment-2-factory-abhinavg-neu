package edu.neu.csye6200;

public class ServiceItemFactory {
    
    private static ServiceItemFactory instance = new ServiceItemFactory();

    private ServiceItemFactory() {

    }

    public Item createItem(String csvLine) {
        return new Item.ServiceItem(csvLine);
    }

    public static ServiceItemFactory getInstance() {
        return instance;
    }
    
    
}
