package it.gb.vendingMachine;

import it.gb.vendingMachine.VendingMachine.productId;

public class IdleState implements VendingMachineState {

    private VendingMachine machine;

    public IdleState(VendingMachine machine) {
        super();
        this.machine = machine;
    }

    @Override
    public void insertCredit(int credit) {
        this.machine.currentCredit += credit;
        this.machine.setCurrentState(this.machine.getHasCreditState());
    }

    @Override
    public void selectProduct(productId prId) {
        System.out.println("Every product costs 1 credit. Curernt credits: " + this.machine.currentCredit);
    }

    @Override
    public void dispenseProduct() {
        throw new UnsupportedOperationException("Cannot dispense products...");
    }

    @Override
    public String getDroppedProduct() {
        throw new UnsupportedOperationException("Cannot get products...");
    }

    @Override
    public String toString() {
        return "Idle State";
    }   
}
