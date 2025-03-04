package creational.abstractfactory;

class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("MaxOS button was rendered.");
    }
}
