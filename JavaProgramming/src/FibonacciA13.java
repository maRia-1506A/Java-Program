// import java.util.Scanner;

// public class FibonacciA13 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int first=0, second=1, fibo, n;
//         System.out.print("Enter numbers you want: ");
//         n= input.nextInt();
//         System.out.print(first +" " +second);

//         for(int i=3; i<=n; i++) {
//             fibo= first + second;
//             System.out.print(" " +fibo); //1st 2nd print krsi ty next fibo o print krte hbe
//             first= second;
//             second= fibo; 
//         }
//         System.out.println();
//     }
// }


//value from fibbonaci series(Assignment13)
import java.util.Scanner;

public class FibonacciA13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int first=0, second=1, fibo=0, n;
        System.out.print("Enter numbers you want: ");
        n= input.nextInt();
        System.out.print(first +" " +second);
        
        for(int i=3; i<=n; i++) {
            fibo= first + second;
            System.out.print(" " +fibo); //1st 2nd print krsi ty next fibo o print krte hbe
            first= second;
            second= fibo; 
        }
        System.out.println("\nThe value of "+n+"th fibonnaci series is: "+fibo);
    }
}