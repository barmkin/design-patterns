package it.gb.atmDispenserMachine;

public interface Dispenser {
    String dispenseReceipt(int ammount);
    void setNextDispenser(Dispenser dispenser);
}
