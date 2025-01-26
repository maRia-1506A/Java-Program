//1.5+2.5+3.5+......n
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double n1=1.5, n2, sum=0;
        System.out.print("Enter last number: ");
        n2= input.nextDouble();

        for(double i=1.5; i<=n2; i++) {
            sum= sum +i;
        }
        System.out.println("The sum= " +sum);

    }
}


// //1^2+2^2+3^2+.....n
// import java.util.Scanner;

// public class series {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int n1=1, n2, sum=0;
//         System.out.print("Enter last number: ");
//         n2= input.nextInt();

//         for(int i=1; i<=n2; i++) {
//             sum= sum + i*i;
//         }
//         System.out.println("The sum= " +sum);

//     }
// }


//1.5*2.5*3.5*......n
// import java.util.Scanner;

// public class series {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         double n1=1.5, n2, result=1;
//         System.out.print("Enter last number: ");
//         n2= input.nextDouble();

//         for(double i=1.5; i<=n2; i++) {
//             result= result * i;
//         }
//         System.out.println("The result= " +result);

//     }
// }


//1^2*2^2*3^2+.....n
// import java.util.Scanner;

// public class series {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int n1=1, n2, result=1;
//         System.out.print("Enter last number: ");
//         n2= input.nextInt();

//         for(int i=1; i<=n2; i++) {
//             System.out.print(i +" ");
//             result= result * i*i;
//         }
//         System.out.println("\nThe sum= " +result);

//     }
// }
