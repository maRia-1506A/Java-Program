//sum of odd number
// import java.util.Scanner;

// public class SumofNumberA12 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int m, n, sum=0;
//         System.out.print("Enter starting number: ");
//         m= input.nextInt();
//         System.out.print("Enter ending number: ");
//         n= input.nextInt();

//         for(int i=m; i<=n; i=i+2) {
//             sum= sum + i;
//         }
//         System.out.println("Total sum: " +sum);

//     }  
// }


// //sum of a digit
import java.util.Scanner;
public class SumofNumberA12 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number, remainder, sum=0;
        System.out.print("Enter the number: ");
        number= input.nextInt();
        
        while(number!=0) {
            remainder= number % 10;
            sum= sum + remainder;
            number= number/10;
        }
        System.out.println("The sum: " +sum);
    }
}


//reverse
// import java.util.Scanner;
// public class SumofNumberA12 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int number, remainder, sum=0;
//         System.out.print("Enter the number: ");
//         number= input.nextInt();
        
//         while(number!=0) {
//             remainder= number % 10;
//             sum= sum * 10 + remainder;
//             number= number/10;
//         }
//         System.out.println("The reverse: " +sum);
//     }
// }



