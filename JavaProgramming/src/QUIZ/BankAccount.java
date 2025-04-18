package QUIZ;
import java.util.Scanner;

class InsufficientBalanceException  extends Exception {
    InsufficientBalanceException(String s) {
        super(s);
    }
}
public class BankAccount {
    private static double balance;
    private String accountNumber;
    
    public void setBalance(double balance) {
        this.balance= balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber= accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public static void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Invalid");
        } else {
            balance= balance - amount;
            System.out.println("Withdrawn: "+amount+" Balance: "+balance);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter account balance: ");
            balance= sc.nextDouble();
            
            System.out.println("Enter withdrawl amount: ");
            int tk= sc.nextInt();
            withdraw(tk);
        } catch(InsufficientBalanceException ex) {
            System.out.println(ex);
        }
    }

}

