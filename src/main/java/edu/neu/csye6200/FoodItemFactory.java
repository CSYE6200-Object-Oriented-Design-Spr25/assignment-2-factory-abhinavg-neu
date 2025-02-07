package edu.neu.csye6200;
public class FoodItemFactory {
    
   public Item createItem(String csvLine) {

    Item foodItem = new Item.FoodItem(csvLine);
    return foodItem;
    
}
}
