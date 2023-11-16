package it.gb.onlineShoppingSystem.payment;

import it.gb.onlineShoppingSystem.Item;

public class PaymentProcessing {
    
    public PaymentProcessing() {
        super();
    }

    public void processPayment() {
        System.out.println("[Payment Processing Subsystem] Processing");
    }

    public String processPayment(Item item, int quantity, int price, String paymentInfo) {
        System.out.println("[Payment Processing Subsystem] Processing payment [" + paymentInfo + "]");

        StringBuilder receipt = new StringBuilder();
        receipt.append("\n- - - - - - - - -");
        receipt.append("\n  Item: " + item.name());
        receipt.append("\n  Quantity: " + quantity);
        receipt.append("\n  Price: " + price);
        receipt.append("\n- - - - - - - - -");

        return receipt.toString();
    }
}
