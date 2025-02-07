package edu.neu.csye6200;

public class Item {
    protected String name;
    protected String ID;
    protected double price;


    public static class FoodItem extends Item {
        public FoodItem (String csvLine) {
            String[] data = csvLine.split(",");
            name = data[1];
            ID = data[2];
            price = Double.parseDouble(data[3]);
        }
        @Override
        public String toString() {
            return "FoodItem: " + name + " " + ID + " " + price;
        }
    }


    public static class ElectronicItem extends Item {
        public ElectronicItem (String csvLine) {
            String[] data = csvLine.split(",");
            name = data[1];
            ID = data[2];
            price = Double.parseDouble(data[3]);
        }
        @Override
        public String toString() {
            return "ElectronicItem: " + name + " " + ID + " " + price;
        }
    }

    public static class ServiceItem extends Item {
        public ServiceItem (String csvLine) {
            String[] data = csvLine.split(",");
            name = data[1];
            ID = data[2];
            price = Double.parseDouble(data[3]);
        }
        @Override
        public String toString() {
            return "ServiceItem: " + name + " " + ID + " " + price;
        }
    }
}