package it.gb.vendingMachine;

import it.gb.vendingMachine.VendingMachine.productId;

public class DispensingState implements VendingMachineState {
    
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        super();
        this.machine = machine;
    }

    @Override
    public void insertCredit(int credit) {
        this.machine.currentCredit += credit;
    }

    @Override
    public void selectProduct(productId prId) {
        throw new UnsupportedOperationException("Cannot select product while dispensing...");
    }

    @Override
    public void dispenseProduct() {
        if (this.machine.currentCredit <= 0) {
            throw new UnsupportedOperationException("No credits!");
        }

        this.machine.currentCredit -= 1;

        System.out.println("Dispensing product...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Product dropped");
        this.machine.droppedProduct = this.machine.selectedProduct;
        this.machine.setCurrentState(machine.getProductDroppedState());
    }

    @Override
    public String getDroppedProduct() {
        throw new UnsupportedOperationException("Cannot get product while dispensing!");
    }

    @Override
    public String toString() {
        return "Dispensing State";
    }    

}
