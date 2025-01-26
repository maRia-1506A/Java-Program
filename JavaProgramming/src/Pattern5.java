// /*  1 2 3
//       1 2
//         1
//  */
// import java.util.Scanner;

// public class Pattern5 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int row, col, number;
//         System.out.print("Enter row: ");
//         number= input.nextInt();

//         for(row=number; row>=1; row--) {
//             //print space
//             for(col=1; col<=number-row; col++) {
//                 System.out.print("  "); //double space
//             } 
//             //print number 
//             for(col=1; col<=row; col++) {
//                 System.out.print(" " +col);
//             }                
//             System.out.println();
//         }
//     }  
// }


/*  c c c
      b b
        a
 */
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int row, col, number;
        System.out.print("Enter row: ");
        number= input.nextInt();

        for(row=number; row>=1; row--) {
            //print space
            for(col=1; col<=number-row; col++) {
                System.out.print("  "); //double space
            } 
            //print number 
            for(col=1; col<=row; col++) {
                System.out.print(" " +(char) (row+96));
            }                
            System.out.println();
        }
    }  
}


// /*  1 1 1
//       0 0
//         1
//  */
// import java.util.Scanner;

// public class Pattern5 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int row, col, number;
//         System.out.print("Enter row: ");
//         number= input.nextInt();

//         for(row=number; row>=1; row--) {
//             //print space
//             for(col=1; col<=number-row; col++) {
//                 System.out.print("  "); //double space
//             } 
//             //print number 
//             for(col=1; col<=row; col++) {
//                 System.out.print(" " +row%2);
//             }                
//             System.out.println();
//         }
//     }
    
// }


// /*  1 0 1
//       1 0
//         1
//  */
// import java.util.Scanner;

// public class Pattern5 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int row, col, number;
//         System.out.print("Enter row: ");
//         number= input.nextInt();

//         for(row=number; row>=1; row--) {
//             //print space
//             for(col=1; col<=number-row; col++) {
//                 System.out.print("  "); //double space
//             } 
//             //print number 
//             for(col=1; col<=row; col++) {
//                 System.out.print(" " +col%2);
//             }                
//             System.out.println();
//         }
//     } 
// }
