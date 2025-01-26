/*  3 3 3
    2 2
    1
 */
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int row, col, number;
        System.out.print("Enter row number: "); 
        number= input.nextInt();                 
                                               
        for(row=number; row>=1; row--) {
            for(col=1; col<=row; col++) {
                System.out.print(" " +row);
            }
            System.out.println();
        }
    }
}