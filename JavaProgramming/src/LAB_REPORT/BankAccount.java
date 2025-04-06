//Question 1: Secure Your Treasure!

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    //setter accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber= accountNumber;
    }

    //getter accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    //setter accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName= accountHolderName;
    }

    //getter accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    
    //setter balance
    public void setBalance(double balance) {
        this.balance= balance;
    }

    //getter balance
    public double getBalance() {
        return balance;
    }

    //display method
    public void display() {
        System.out.println("Account Holder Number: "+getAccountNumber());
        System.out.println("Account Holder Name: "+getAccountHolderName());
        System.out.println("Balnce: "+getBalance());
    }

    //deposite method
    public void deposite(double ammount) {
        if(ammount > 0) {
            ammount += balance;
            System.out.println("Deposite: "+ammount);
        } else {
            System.out.println("Deposite ammount must be positive\n");
        }
    }

    //withdraw method
    public void withdraw(double ammount) {
        if(ammount > 0 && balance >= ammount) {
                ammount -= balance;
                System.out.println("Withdrawn: "+ammount);
        } else {
                System.out.println("Insuffecient balance\n");
        }
    }

    public static void main(String[] args) {
        BankAccount ba= new BankAccount();
        Scanner input= new Scanner(System.in);

        System.out.println("Enter Account Holder Number: ");
        ba.setAccountNumber(input.nextLine());
        System.out.println("Enter Account Holder Name: ");
        ba.setAccountHolderName(input.nextLine());
        System.out.println("Enter balance: ");
        ba.setBalance(input.nextDouble());

        ba.display();

        System.out.println("Enter the ammount you want to deposite: ");
        double depositeAmmount= input.nextDouble();
        ba.deposite(depositeAmmount);
        ba.display();

        System.out.println("Enter the ammount you want to withdraw: ");
        double withdrawAmmount= input.nextDouble();
        ba.deposite(withdrawAmmount);
        ba.display();
    }
}