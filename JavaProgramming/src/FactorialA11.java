import java.util.Scanner;

public class FactorialA11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= input.nextInt();

        int fact=1;
        for(int i=number; i>=1; i--) {    
            fact= fact*i;
        }
        System.out.println("Factorial value: " +fact);
    }
    
}
