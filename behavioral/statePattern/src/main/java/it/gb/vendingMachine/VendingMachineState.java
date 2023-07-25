package it.gb.vendingMachine;

import it.gb.vendingMachine.VendingMachine.productId;

public interface VendingMachineState {
    public void insertCredit(int credit);
    public void selectProduct(productId prId);
    public void dispenseProduct();
    public String getDroppedProduct();
}
