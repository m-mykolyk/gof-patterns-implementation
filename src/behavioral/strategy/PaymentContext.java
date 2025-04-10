package behavioral.strategy;

class PaymentContext {
    private PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void payAmount(int amount) {
        if(paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
