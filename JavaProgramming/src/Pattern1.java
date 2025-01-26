/*  1
    1 2
    1 2 3
 */
// import java.util.Scanner;

// public class Pattern1 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int row, col, number;
//         System.out.print("Enter row number: ");  
//         number= input.nextInt();                       
//                                               
//         for(row=1; row<=number; row++) {
//             for(col=1; col<=row; col++) {
//                 System.out.print(" " +col);
//             }
//             System.out.println();
//         }    
//     }
// }


import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int row, col, number;
        System.out.print("Enter row number: "); //  *
        number= input.nextInt();                  //  * *    
                                                  //  * * *
        for(row=1; row<=number; row++) {
            for(col=1; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}
