//if else
import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        System.out.println("Do you lover java?");
        Scanner input= new Scanner(System.in);
        char ans= input.next().charAt(0);

        if(ans=='y' || ans=='Y') {
            System.out.println("You are a java lover");
        } else if(ans=='n' || ans=='N') {
            System.out.println("You are not a java lover");
        } else {
            System.out.println("Invalid");
        }
    } 
}


