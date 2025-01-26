// import java.util.Scanner;

// public class Prime {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int n, count=0;
//         System.out.print("Enter a number: ");
//         n= input.nextInt();

//         if(n==0 || n==1) {
//             System.out.println("Not a prime number");
//         } else {
//             for(int i=2; i<n; i++) {
//                 if(n%i==0) {
//                     count++;
//                     break;
//                 }
//             }
//             if(count==0) {
//                 System.out.println("Prime");
//             } else {
//                 System.out.println("Not Prime");
//             }
//         }  
//     }
// }


//prime number in range
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1, n2, count=0;
        System.out.print("Enter 1st range: ");
        n1= input.nextInt();
        System.out.print("Enter last range: ");
        n2= input.nextInt();

        for(int i=n1; i<=n2; i++) {
            count=0;
            if(i==0 || i==1) {
                count=1;
            } else {
                for(int j=2; j<i; j++) {
                    if(i%j==0) {
                        count++;
                        break;
                    }
                }
                if(count==0) {
                    System.out.println(i);
                }
            }
        }

    }

}

