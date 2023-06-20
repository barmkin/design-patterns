package it.gb.atmDispenserMachine;

public class AtmDispenser20 implements Dispenser {

    private Dispenser next;

    private int currentBillStorage;

    public AtmDispenser20(int startingBills) {
        super();
        this.currentBillStorage = startingBills;
    }

    @Override
    public String dispenseReceipt(int ammount) {
        StringBuilder receipt = new StringBuilder();

        int residual = ammount;
        int count = 0;
        while(residual - 20 >= 0) { // can withdraw 20
            if (this.currentBillStorage > 0) {
                this.currentBillStorage--;
                residual -= 20;
                count++;
            } else {
                System.out.println("[!] AtmDispenser20 EMPTY!");
                break;
            }
        }
        
        receipt.append("\n\t\t# of 20: " + count);

        if (residual > 0)
            receipt.append(next.dispenseReceipt(residual));
        
        return receipt.toString();
    }

    @Override
    public void setNextDispenser(Dispenser dispenser) {
        this.next = dispenser;
    }
    
}
