//switch
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Select the option(1-4): ");
        int option= input.nextInt();

        switch(option) {
            case 1:
            System.out.println("Selected langugae is Bengali");
            break;
            case 2:
            System.out.println("Selected langugae is Hindi");
            break;
            case 3:
            System.out.println("Selected langugae is Urdu");
            break;
            case 4:
            System.out.println("Selected langugae is English");
            break;
            default:
            System.out.println("Wrong option");
        }
    }
    
}
