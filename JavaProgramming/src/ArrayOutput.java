//find output program
/*  0  1  2  3  4
    5  6  7  8  9
    10 11 12 13 14
    15 16 17 18 19
 */
import java.util.Scanner;
public class ArrayOutput {
    public static void main(String[] args) {
        int[][] arr= new int[4][5];
        Scanner input= new Scanner(System.in);
        int k=0;

        //scanning input
        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                arr[i][j]= k;
                k++;
            }
        }
        //printing matrix
        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


//find output program
/*  0
    1 2
    3 4 5
    6 7 8 9
 */
// import java.util.Scanner;
// public class ArrayOutput {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int[][] arr= new int[4][]; //col ar size na dleo prblm nai kintu row dtei hbe naile error
//         arr[0]= new int[1];
//         arr[1]= new int[2];
//         arr[2]= new int[3];
//         arr[3]= new int[4];
//         int k=0;

//         //scanning input
//         for(int i=0; i<4; i++) {
//             for(int j=0; j<i+1; j++) { //row theke col 1 besi ty i+1
//                 arr[i][j]= k;
//                 k++;
//             }
//         }
//         //printing
//         for(int i=0; i<4; i++) {
//             for(int j=0; j<i+1; j++) { 
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
