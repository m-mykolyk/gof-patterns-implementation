package behavioral.state;

class HasMoneyState implements State {
    private final VendingMachine vendingMachine;

    HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("ERROR: Money already inserted!");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed.");
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }
}
