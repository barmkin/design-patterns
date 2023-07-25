package it.gb.vendingMachine;

public class VendingMachine {

    public enum productId {
        SNACK,
        CHIPS,
        COLA
    }

    private VendingMachineState currentState;
    private VendingMachineState idleState;
    private VendingMachineState hasCreditState;
    private VendingMachineState dispensingState;
    private VendingMachineState productDroppedState;

    protected int currentCredit;
    protected productId droppedProduct;
    protected productId selectedProduct;
    
    public VendingMachine() {
        super();
        this.currentCredit = 0;
        this.droppedProduct = null;
        this.idleState = new IdleState(this);
        this.hasCreditState = new HasCreditState(this);
        this.dispensingState = new DispensingState(this);
        this.productDroppedState = new ProductDroppedState(this);
        this.currentState = idleState;
    }

    // Functions
    
    /** Handles the insertion of credit and changes the vending machine's state accordingly. */
    public void inserCredit(int credit) {
        this.currentState.insertCredit(credit);
    }

    /** : Handles the product selection and changes the state to the appropriate one. */
    public void selectProduct(productId prId) {
        this.currentState.selectProduct(prId);
    }

    public String getProduct() {
        return this.currentState.getDroppedProduct();
    }

    public void waitDispesing() {
        this.currentState.dispenseProduct();
    }

    // States

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public VendingMachineState getIdleState() {
        return this.idleState;
    }

    public VendingMachineState getHasCreditState() {
        return this.hasCreditState;
    }

    public VendingMachineState getDispensingState() {
        return this.dispensingState;
    }

    public VendingMachineState getProductDroppedState() {
        return this.productDroppedState;
    }



}
