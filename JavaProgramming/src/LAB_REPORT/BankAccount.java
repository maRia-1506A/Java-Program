//Question 1: Secure Your Treasure!

import java.util.Scanner;

public class BankAccount {
    private String accountHolderName, accountNumber;
    private double balance;

    //set accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName= accountHolderName;
    }
    //get accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    //set accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber= accountNumber;
    }
    //get accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    //set balance
    public void setBalance(double balance) {
        this.balance= balance;
    }
    //get balance
    public double getBalance() {
        return balance;
    }

    //method deposit
    public void deposit(double amount) {
        if(amount > 0) {
            amount += balance;
            System.out.println("Deposit balance: "+amount);
        } else {
            System.out.println("Only positive deposit is allowed");
        }
    }

    //method withdraw
    public void withdraw(double amount) {
        if(balance >= amount && amount > 0) {
            amount -= balance;
            System.out.println("Withdraws money: "+amount);
        } else {
            System.out.println("The balance is sufficient");
        }
    }

    //method display
    public void display() {
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }

    //method user
    public void user() {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter account holder name: "); 
        accountHolderName= input.nextLine();
        System.out.println("Enter account number: "); 
        accountNumber= input.nextLine();
        System.out.println("Enter balance: "); 
        balance= input.nextDouble();

        System.out.println("Enter deposit amount: ");
        double depositAmount= input.nextDouble();
        deposit(depositAmount);

        System.out.println("Enter withdrawn ammount: ");
        double withdrawAmount= input.nextDouble();
        withdraw(withdrawAmount);
    }

}

class Maain {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount();
        ba.user();
        ba.display();
    }
}

// import java.util.Scanner;

// public class BankAccount {
   
//     public static void main(String[] args) {
//         BankAccount ba= new BankAccount();
//         Scanner input= new Scanner(System.in);

//         System.out.println("Enter Account Holder Number: ");
//         ba.setAccountNumber(input.nextLine());
//         System.out.println("Enter Account Holder Name: ");
//         ba.setAccountHolderName(input.nextLine());
//         System.out.println("Enter balance: ");
//         ba.setBalance(input.nextDouble());

//         ba.display();

//         System.out.println("Enter the ammount you want to deposite: ");
//         double depositeAmmount= input.nextDouble();
//         ba.deposite(depositeAmmount);
//         ba.display();

//         System.out.println("Enter the ammount you want to withdraw: ");
//         double withdrawAmmount= input.nextDouble();
//         ba.deposite(withdrawAmmount);
//         ba.display();
//     }
// }