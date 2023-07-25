package it.gb.vendingMachine;

import it.gb.vendingMachine.VendingMachine.productId;

public class HasCreditState implements VendingMachineState {

    private VendingMachine machine;

    public HasCreditState(VendingMachine machine) {
        super();
        this.machine = machine;
    }

    @Override
    public void insertCredit(int credit) {
        this.machine.currentCredit += credit;
        System.out.println("Current credits: " + this.machine.currentCredit);
    }

    @Override
    public void selectProduct(productId prId) {
        this.machine.selectedProduct = prId;
        this.machine.setCurrentState(this.machine.getDispensingState());
    }

    @Override
    public void dispenseProduct() {
        if (this.machine.selectedProduct == null) {
            throw new UnsupportedOperationException("Cannot dispense product!");
        } else {
            this.selectProduct(this.machine.selectedProduct);
        }
    }

    @Override
    public String getDroppedProduct() {
        throw new UnsupportedOperationException("Cannot get product!");
    }

    @Override
    public String toString() {
        return "Has Credit State";
    }   

    
}
