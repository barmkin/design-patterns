package it.gb.onlineShoppingSystem.order;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

import it.gb.onlineShoppingSystem.Item;

public class OrderProcessing {

    Map<Item, Integer> itemsValues;

    public OrderProcessing() {
        super();
        itemsValues = new HashMap<Item, Integer>();
        itemsValues.put(Item.ITEM_A, 2);
        itemsValues.put(Item.ITEM_B, 5);
        itemsValues.put(Item.ITEM_C, 3);
        itemsValues.put(Item.ITEM_D, 12);
        itemsValues.put(Item.ITEM_E, 1);

    }

    /** Return order price */
    public int placeOrder(Item item, int quantity) {
        if (quantity <= 0) {
            new InvalidParameterException("Invalid quantity!");
        }

        System.out.println("[Order Processing Subsystem] Placing order...");
        return itemsValues.get(item) * quantity;
    }
}
