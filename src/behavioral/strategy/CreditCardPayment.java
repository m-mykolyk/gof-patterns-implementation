package behavioral.strategy;

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "₴ using credit card.");
    }
}
