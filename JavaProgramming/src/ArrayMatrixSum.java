//diagonal, upper, lower
import java.util.Scanner;

public class ArrayMatrixSum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][] A= new int[3][3];
        int sumofDiagonal=0, sumofUpper=0, sumofLower=0, sumofMiddlecol=0, sumofThirdrow=0;
        //scanning A
        System.out.println("Enter elements for matrix A: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                A[i][j]= input.nextInt();
            }
        }
        System.out.println();
        //printing A
        System.out.println("A: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //diagonal, upper, lower
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(i==j) {
                    sumofDiagonal= sumofDiagonal + A[i][j]; //diagonal
                }
                if(i<j) {
                    sumofUpper= sumofUpper+ A[i][j]; //upper
                }
                if(i>j) {
                    sumofLower= sumofLower+ A[i][j]; //lower
                }
                if(j==1) {
                    sumofMiddlecol= sumofMiddlecol+ A[i][j]; //middle column as index stars from 0
                }
                if(i==2) {
                    sumofThirdrow= sumofThirdrow+ A[i][j]; //third row
                }
            }
        }
        System.out.println("Sum of diagonal matrix: " +sumofDiagonal);
        System.out.println("Sum of upper matrix: " +sumofUpper);
        System.out.println("Sum of lower matrix: " +sumofLower);
        System.out.println("Sum of middle column: " +sumofMiddlecol);
        System.out.println("Sum of third row: " +sumofThirdrow);
    }
    
}
