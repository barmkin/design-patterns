package it.gb.vendingMachine;

import it.gb.vendingMachine.VendingMachine.productId;

public class ProductDroppedState implements VendingMachineState {

    private VendingMachine machine;

    public ProductDroppedState(VendingMachine machine) {
        super();
        this.machine = machine;
    }

    @Override
    public void insertCredit(int credit) {
        this.machine.currentCredit += credit;
    }

    @Override
    public void selectProduct(productId prId) {
        throw new UnsupportedOperationException("Please get the dropped product first!");
    }

    @Override
    public void dispenseProduct() {
        throw new UnsupportedOperationException("Cannot dispense products!");
    }

    @Override
    public String getDroppedProduct() {
        productId dropped = this.machine.droppedProduct;
        if (this.machine.currentCredit > 0) {
            this.machine.setCurrentState(this.machine.getHasCreditState());
        } else {
            this.machine.setCurrentState(this.machine.getIdleState());
        }
        this.machine.droppedProduct = null;
        
        return dropped.name();
    }

    @Override
    public String toString() {
        return "Product Dropped State";
    }   
   
}
