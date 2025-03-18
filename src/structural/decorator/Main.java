package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + ": price: " + simpleCoffee.getCost() + " ₴");

        Coffee sugarCoffee = new SugarDecorator(new SimpleCoffee());
        System.out.println(sugarCoffee.getDescription() + ": price: " + sugarCoffee.getCost() + " ₴");

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + ": price: " + milkCoffee.getCost() + " ₴");

        Coffee sugarMilkCoffee = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        System.out.println(sugarMilkCoffee.getDescription() + ": price: " + sugarMilkCoffee.getCost() + " ₴");

    }
}
