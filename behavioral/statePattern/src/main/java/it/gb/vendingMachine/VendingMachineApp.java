package it.gb.vendingMachine;

import it.gb.vendingMachine.VendingMachine.productId;

public abstract class VendingMachineApp {

    public static void executeVendingMachineApp() {
        System.out.println("Vending Machine App - 1 credit = 1 product");

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.inserCredit(1); // 1 -> end on Idle State, 2+ -> end on Has Credit State

        vendingMachine.selectProduct(productId.CHIPS);

        vendingMachine.waitDispesing();

        String product = vendingMachine.getProduct();

        System.out.println("Obtained " + product);

        System.out.println(vendingMachine.getCurrentState().toString());
    }

}
