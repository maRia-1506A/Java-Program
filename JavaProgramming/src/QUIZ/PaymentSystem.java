package QUIZ;

public class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        BankTransferPayment bankTransferPayment = new BankTransferPayment();
        creditCardPayment.processPayment(100.50);
        creditCardPayment.generateReceipt();
        payPalPayment.processPayment(75.25);
        payPalPayment.generateReceipt();
        bankTransferPayment.processPayment(200.00);
        bankTransferPayment.generateReceipt();
    }
}

class CreditCardPayment {
    public double payment;

    CreditCardPayment() {

    }
    public void processPayment(double payment) {
        System.out.println("Processing credit card payment of $"+payment);
    }
    public void generateReceipt() {
        System.out.println("Payment processed successfully");
    }
}

class PayPalPayment {
    public double payment;

    PayPalPayment() {

    }
    public void processPayment(double payment) {
        System.out.println("Processing credit card payment of $"+payment);
    }
    public void generateReceipt() {
        System.out.println("Payment processed successfully");
    }
}

class BankTransferPayment {
    public double payment;

    BankTransferPayment() {

    }
    public void processPayment(double payment) {
        System.out.println("Processing credit card payment of $"+payment);
    }
    public void generateReceipt() {
        System.out.println("Payment processed successfully");
    }
}