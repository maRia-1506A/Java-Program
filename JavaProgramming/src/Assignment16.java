//validate user based on username & password
import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        for(int i=1; i<=3; i++) {
            System.out.print("Enter your username: ");
            String userName= input.next();
            System.out.print("Enter your password: ");
            int pass= input.nextInt();
            if(userName.equals("Maria") && pass== 12345) {
                System.out.println("Welcome to the system.");
                break;
            } else {
                System.out.println("Please try again.");
            }
        }
    } 
}

