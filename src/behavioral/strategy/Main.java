package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.payAmount(1000);

        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.payAmount(2000);

        paymentContext.setPaymentStrategy(null);
        paymentContext.payAmount(3000);
    }
}
