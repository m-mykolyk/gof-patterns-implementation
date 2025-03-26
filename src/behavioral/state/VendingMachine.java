package behavioral.state;

class VendingMachine {
    private final State idleState;
    private final State hasMoneyState;
    private State currentState;

    VendingMachine() {
        idleState = new IdleState(this);
        hasMoneyState = new HasMoneyState(this);
        currentState = idleState;
    }

    State getIdleState() {
        return idleState;
    }

    State getHasMoneyState() {
        return hasMoneyState;
    }

    void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    void insertMoney() {
        currentState.insertMoney();
    }

    void dispenseItem() {
        currentState.dispenseItem();
    }
}
