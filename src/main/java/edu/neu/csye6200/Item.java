package edu.neu.csye6200;

public class Item {
    private String name;
    private String ID;
    private double price;


    public class FoodItem extends Item {
        public FoodItem (String csvLine) {
            String[] data = csvLine.split(",");
            name = data[0];
            ID = data[1];
            price = Double.parseDouble(data[2]);
        }
        @Override
        public String toString() {
            return "FoodItem: " + name + " " + ID + " " + price;
        }
    }


    public class ElectronicItem extends Item {
        public ElectronicItem (String csvLine) {
            String[] data = csvLine.split(",");
            name = data[0];
            ID = data[1];
            price = Double.parseDouble(data[2]);
        }
        @Override
        public String toString() {
            return "ElectronicItem: " + name + " " + ID + " " + price;
        }
    }

    public class ServiceItem extends Item {
        public ServiceItem (String csvLine) {
            String[] data = csvLine.split(",");
            name = data[0];
            ID = data[1];
            price = Double.parseDouble(data[2]);
        }
        @Override
        public String toString() {
            return "ServiceItem: " + name + " " + ID + " " + price;
        }
    }
}