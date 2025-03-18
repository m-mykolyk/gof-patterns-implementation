package structural.decorator;

class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20.0;
    }
}
