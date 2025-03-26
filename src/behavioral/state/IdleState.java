package behavioral.state;

class IdleState implements State{
    private final VendingMachine vendingMachine;

    IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted.");
        vendingMachine.setCurrentState(vendingMachine.getHasMoneyState());
    }

    @Override
    public void dispenseItem() {
        System.out.println("ERROR: Money not inserted!");
    }
}
