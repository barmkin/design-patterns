package it.gb.atmDispenserMachine;

public class AtmDispenser10 implements Dispenser {

    private int currentBillStorage;

    public AtmDispenser10(int startingBills) {
        super();
        this.currentBillStorage = startingBills;
    }

    @Override
    public String dispenseReceipt(int ammount) {
        StringBuilder receipt = new StringBuilder();

        int residual = ammount;
        int count = 0;
        while(residual - 10 >= 0) { // can withdraw 10
            if (this.currentBillStorage > 0) {
                this.currentBillStorage--;
                residual -= 10;
                count++;
            } else {
                System.out.println("[!] AtmDispenser10 EMPTY!");
                break;
            }
        }
        
        receipt.append("\n\t\t\t# of 10: " + count);

        if (residual > 0)
            receipt.append("\n[!] WARN - CANNOT PASS TO ANOTHER DISPENSER - Residual: " + residual);
        
        return receipt.toString();
    }

    @Override
    @Deprecated
    public void setNextDispenser(Dispenser dispenser) {
        System.err.println("WARN - CANNOT PASS TO ANOTHER DISPENSER");
    }
    
}
