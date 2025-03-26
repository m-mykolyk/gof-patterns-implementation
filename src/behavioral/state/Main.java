package behavioral.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.dispenseItem();

        machine.insertMoney();
        machine.insertMoney();
        machine.dispenseItem();

        machine.insertMoney();
        machine.dispenseItem();
    }
}
