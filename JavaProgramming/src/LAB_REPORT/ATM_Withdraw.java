//Question 5: ATM Withdrawal System!

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM_Withdraw {
    private static double accountBalance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Program starts here...");
            System.out.println("Enter Account balance: ");
            accountBalance = sc.nextDouble();

            System.out.println("Enter the balance you want to withdraw: ");
            double withdrawlBalance = sc.nextDouble();
            System.out.println("After testing...");

            withdraw1(withdrawlBalance);

        } catch (InputMismatchException ex) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex);
        } catch (InvalidAmountException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Transaction complete. Thank you for banking with us!");
        }
    }

    // method
    public static void withdraw1(double withdrawlBalance) throws InsufficientBalanceException, InvalidAmountException {
        if (withdrawlBalance > accountBalance) {
            throw new InsufficientBalanceException("\nInsufficient funds!");
        } else if (withdrawlBalance <= 0) {
            throw new InvalidAmountException("\nInvalid withdrawal amount!");
        } else {
            accountBalance = accountBalance - withdrawlBalance;
            System.out.println("Current balance: " + accountBalance);
        }
    }
}

// custome exception 1
class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String str) {
        super(str);
    }
}

// custome exception 2
class InvalidAmountException extends RuntimeException {
    InvalidAmountException(String s) {
        super(s);
    }
}
