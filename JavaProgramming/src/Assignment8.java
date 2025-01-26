//if else
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char ms, eng;
        System.out.println("Have you completed your masters? (y/Y/n/N)");
        ms= input.next().charAt(0);
        System.out.println("Are you fluent in English? y/Y/n/N");
        eng= input.next().charAt(0);

        if((ms=='y' || ms=='Y') && (eng=='y' || eng=='Y')) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }
    
}
