package it.gb.onlineShoppingSystem.inventory;

import java.util.HashMap;
import java.util.Map;

import it.gb.onlineShoppingSystem.Item;

public class InventoryManagement {

    private Map<Item, Integer> inventory;

    public InventoryManagement() {
        super();

        // Simulate inventory map
        inventory = new HashMap<>();
        inventory.put(Item.ITEM_A, 5);
        inventory.put(Item.ITEM_B, 15);
        inventory.put(Item.ITEM_C, 3);
        inventory.put(Item.ITEM_D, 7);
        inventory.put(Item.ITEM_E, 41);
    }

    public boolean checkStock(Item item, int quantity) {
        System.out.println("[Inventory Management Subsystem] Checking stock...");
        return inventory.get(item) >= quantity;
    }

    public boolean pickItem(Item item, int quantity) {
        System.out.println("[Inventory Management Subsystem] Picking item...");
        if (checkStock(item, quantity)) {
            inventory.replace(item, inventory.get(item) - quantity);
            return true;
        }

        return false;
    }
}
