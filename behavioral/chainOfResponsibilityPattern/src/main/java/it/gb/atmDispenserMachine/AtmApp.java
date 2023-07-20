package it.gb.atmDispenserMachine;

public abstract class AtmApp {

    public static void executeAtmDispenserApp() {
        // -------------- ATM -----------------------------
        AtmDispenser atm = new AtmDispenser();
        AtmDispenser50 dispenser50 = new AtmDispenser50(15);
        AtmDispenser20 dispenser20 = new AtmDispenser20(40);
        AtmDispenser10 dispenser10 = new AtmDispenser10(400);

        atm.setNextDispenser(dispenser50);
        dispenser50.setNextDispenser(dispenser20);
        dispenser20.setNextDispenser(dispenser10);

        System.out.println(atm.dispenseReceipt(580));
        System.out.println(atm.dispenseReceipt(530));
        System.out.println(atm.dispenseReceipt(456));
        System.out.println(atm.dispenseReceipt(400));
        System.out.println(atm.dispenseReceipt(80));
        System.out.println(atm.dispenseReceipt(3970));
    }
}
