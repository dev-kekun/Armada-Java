import java.util.Scanner;

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class CryptoWallet implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose payment method (1: Credit Card, 2: PayPal, 3: CryptoWallet): ");
        int choice = scanner.nextInt();

        PaymentMethod paymentMethod;
        switch (choice) {
            case 1:
                paymentMethod = new CreditCard();
                break;
            case 2:
                paymentMethod = new PayPal();
                break;
            case 3:
                paymentMethod = new CryptoWallet();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();
        paymentMethod.processPayment(amount);

    }
}
