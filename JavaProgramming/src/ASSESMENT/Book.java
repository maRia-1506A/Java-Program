package ASSESMENT;
import java.util.Scanner;
import java.lang.*;

public class Book {
    String isbn;
    String title;
    double price;

    void takeinput() {
        Scanner input= new Scanner(System.in);
        System.out.println("ISBN: ");
        isbn= input.nextLine();
        System.out.println("Title: ");
        title= input.nextLine();
        System.out.println("Price: ");
        price= input.nextDouble();
        
    }

    void display() {
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How many book objects you wish to create: ");
        Book number[]= new Book[input.nextInt()];

        for(int i=0; i<number.length; i++) {
            System.out.println("Enter details for book "+(i+1)+" : ");
            number[i]= new Book();
            number[i].takeinput();
            System.out.println();
        }

        System.out.println("Book details: ");
        for(int i=0; i<number.length; i++) {
            number[i].display();
            System.out.println();
        }
    }
}
