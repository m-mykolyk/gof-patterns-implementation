package creational.abstractfactory;

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button was rendered.");
    }
}
