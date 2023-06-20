package it.gb.atmDispenserMachine;

public class AtmDispenser implements Dispenser {

    private Dispenser next;

    @Override
    public String dispenseReceipt(int ammount) {
        if (ammount < 10) {
            return "Cannot execute";
        }

        if (ammount % 10 != 0) {
            return "Value " + ammount + " is not acceptable, specify a right ammount like " + 
            ((int)(Math.floor(ammount/10) * 10)) + " or " + (ammount + (10 - ammount % 10));
        }

        StringBuilder receipt = new StringBuilder();
        receipt.append("Requested " + ammount + " EUR");
        receipt.append(next.dispenseReceipt(ammount));

        return receipt.toString();
    }

    @Override
    public void setNextDispenser(Dispenser dispenser) {
        this.next = dispenser;
    }
    
}
