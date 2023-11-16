package it.gb.onlineShoppingSystem;

public abstract class OnlineShoppingSystemApp {

    public static void executeOnlineShoppingSystemApp() {

        // Create an order via facade
        Item item = Item.ITEM_B;
        int quantity = 3;
        String paymentInfo = "Credit Card 4117 8836 0409 6009";

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.purchaseItem(item, quantity, paymentInfo);
    }
}
