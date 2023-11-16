package it.gb.onlineShoppingSystem;

import it.gb.onlineShoppingSystem.inventory.InventoryManagement;
import it.gb.onlineShoppingSystem.order.OrderProcessing;
import it.gb.onlineShoppingSystem.payment.PaymentProcessing;

public class OrderFacade {
    
    public OrderFacade() {
        super();
    }

    public boolean purchaseItem(Item item, int quantity, String paymentInfo) {
        if (quantity <= 0) {
            System.err.println("Cannot elaborate order, quantity <= 0!");
            return false;
        }

        // Check inventory
        InventoryManagement inventoryManager = new InventoryManagement();
        if (!inventoryManager.checkStock(item, quantity)) {
            System.out.println("Cannot elaborate order, out of stock!");
            return false;
        }
        // Pick items
        if (!inventoryManager.pickItem(item, quantity)) {
            System.out.println("Inventory error! Out of stock?!");
            return false;
        }

        // Create order
        OrderProcessing orderProcessor = new OrderProcessing();
        int cost = orderProcessor.placeOrder(item, quantity);
        
        // Process payment
        PaymentProcessing paymentProcessor = new PaymentProcessing();
        String receipt = paymentProcessor.processPayment(item, quantity, cost, paymentInfo);

        // Print receipt
        System.out.println(receipt);

        return true;
    }
}
