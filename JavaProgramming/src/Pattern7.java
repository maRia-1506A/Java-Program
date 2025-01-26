/*  1 2
    1 2
 */
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int row, col, number;
        System.out.print("Enter row: ");
        number= input.nextInt();

        for(row=1; row<=number; row++) {
            for(col=1; col<=number; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
}
