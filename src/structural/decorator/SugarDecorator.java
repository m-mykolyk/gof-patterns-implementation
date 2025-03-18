package structural.decorator;

class SugarDecorator extends CoffeeDecorator {
    SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }
}
