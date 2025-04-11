import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class AAAA {
    private static double balance;

    public static void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount!");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your current account balance: ");
            balance = sc.nextDouble();

            System.out.print("Enter amount to withdraw: ");
           
            double amount = sc.nextDouble();

            withdraw(amount);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction complete. Thank you for banking with us!");
            sc.close();
        }
    }
}