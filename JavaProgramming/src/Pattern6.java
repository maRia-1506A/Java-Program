/*      1
      1 2
    1 2 3
      1 2
        1
 */
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int row, col, number;
        System.out.print("Enter row: ");
        number= input.nextInt();

        for(row=1; row<=number; row++) {
            //space
            for(col=1; col<=number-row; col++) {
                System.out.print("  ");
            }
            //number
            for(col=1; col<=row; col++) {
                System.out.print(" " +col);
            }
            System.out.println();
        }

        for(row=number-1; row>=1; row--) {
            //space
            for(col=1; col<=number-row; col++) {
                System.out.print("  ");
            }
            //number
            for(col=1; col<=row; col++) {
                System.out.print(" " +col);
            }
            System.out.println();
        }
    }   
}


// /*      1
//       2 2
//     3 3 3
//       2 2
//         1
//  */
// import java.util.Scanner;

// public class Pattern6 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int row, col, number;
//         System.out.print("Enter row: ");
//         number= input.nextInt();

//         for(row=1; row<=number; row++) {
//             //space
//             for(col=1; col<=number-row; col++) {
//                 System.out.print("  ");
//             }
//             //number
//             for(col=1; col<=row; col++) {
//                 System.out.print(" " +row);
//             }
//             System.out.println();
//         }

//         for(row=number-1; row>=1; row--) {
//             //space
//             for(col=1; col<=number-row; col++) {
//                 System.out.print("  ");
//             }
//             //number
//             for(col=1; col<=row; col++) {
//                 System.out.print(" " +row);
//             }
//             System.out.println();
//         }
//     }   
// }


// /*      A
//       A B
//     A B C
//       B C
//         A
//  */
// import java.util.Scanner;

// public class Pattern6 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int row, col, number;
//         System.out.print("Enter row: ");
//         number= input.nextInt();

//         for(row=1; row<=number; row++) {
//             //space
//             for(col=1; col<=number-row; col++) {
//                 System.out.print("  ");
//             }
//             //number
//             for(col=1; col<=row; col++) {
//                 System.out.print(" " +(char)(col+64));
//             }
//             System.out.println();
//         }

//         for(row=number-1; row>=1; row--) {
//             //space
//             for(col=1; col<=number-row; col++) {
//                 System.out.print("  ");
//             }
//             //number
//             for(col=1; col<=row; col++) {
//                 System.out.print(" " +(char)(col+64));
//             }
//             System.out.println();
//         }
//     }   
// }
