public class Item {
    private String name;
    private String description;
    private double price;
    private int quantity;

    public static class FoodItem extends Item {
        private String expirationDate;
    
        public String toString() {
            return "FoodItem: " + name + " " + description + " " + price + " " + quantity + " " + expirationDate;
        }
    }

    public static class ElectronicItem extends Item {
        private String powerConsumption;

        public String toString() {
            return "ElectronicItem: " + name + " " + description + " " + price + " " + quantity + " " + powerConsumption;
        }
    }

    public static class ServiceItem extends Item {
        private String serviceType;

        public String toString() {
            return "ServiceItem: " + name + " " + description + " " + price + " " + quantity + " " + serviceType;
        }
    }
}