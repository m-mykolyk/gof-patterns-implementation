package creational.abstractfactory;

class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows checkbox was checked.");
    }
}
