// public class Array_2d {
//     public static void main(String[] args) {
//         int[][] array= new int[2][3];
//         array[0][0]= 10;
//         array[0][1]= 20;
//         array[0][2]= 30;
//         array[1][0]= 40;
//         array[1][1]= 50;
//         array[1][2]= 60;
    
//         for(int i=0; i<2; i++) {
//             for(int j=0; j<3; j++) {
//                 System.out.print(array[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//matrix sum
import java.util.Scanner;

public class Array_2d{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][] A= new int[2][3];
        int[][] B= new int[2][3];
        int[][] C= new int[2][3];

        //scanning input matrix A
        System.out.println("Enter elements for matrix A: ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("A["+i+"]["+j+"]: ");
                A[i][j]= input.nextInt(); 
            }
        }
        System.out.println();
        //scanning input matrix B
        System.out.println("Enter elements for matrix B: ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                System.out.printf("B[%d][%d]: ", i,j);
                B[i][j]= input.nextInt(); 
            }
        }
        System.out.println();
        //printing matrix A
        System.out.println("A= ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //printing matrix B
        System.out.println("B= ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //printing A+B
        System.out.println("A+B= ");
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(A[i][j]+B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}