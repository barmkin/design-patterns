package it.gb.atmDispenserMachine;

public class AtmDispenser50 implements Dispenser {

    private Dispenser next;

    private int currentBillStorage;

    public AtmDispenser50(int startingBills) {
        super();
        this.currentBillStorage = startingBills;
    }

    @Override
    public String dispenseReceipt(int ammount) {
        StringBuilder receipt = new StringBuilder();

        int residual = ammount;
        int count = 0;
        while(residual - 50 >= 0) { // can withdraw 50
            if (this.currentBillStorage > 0) {
                this.currentBillStorage--;
                residual -= 50;
                count++;
            } else {
                System.out.println("[!] AtmDispenser50 EMPTY!");
                break;
            }
        }
        
        receipt.append("\n\t# of 50s: " + count);

        if (residual > 0)
            receipt.append(next.dispenseReceipt(residual));
        
        return receipt.toString();
    }

    @Override
    public void setNextDispenser(Dispenser dispenser) {
        this.next = dispenser;
    }
    
}
