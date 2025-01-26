/*  1
    1 0
    1 0 1 
    1 0 1 0
 */
import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter row number: ");
        int number= input.nextInt();
        int row, col;

        for(row=1; row<=number; row++) {
            for(col=1; col<=row; col++) {
                System.out.print(" "+col%2);
            }
            System.out.println();
        }
    }
    
}
