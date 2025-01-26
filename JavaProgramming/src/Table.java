// import java.util.Scanner;

// public class Table {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int n;
//         System.out.print("Enter a number: ");
//         n= input.nextInt();
//         System.out.printf("Table of %d:\n", +n);

//         for(int i=1; i<=10; i++) {
//             System.out.println(n+ "x" +i + "=" +n*i); //n+(5) x +i(1) = +n(5) + dia connect krse
//         }
//     }
// }


//table in range
import java.util.Scanner;

public class Table{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1, n2;

        System.out.print("Enter 1st number: ");
        n1= input.nextInt();
        System.out.print("Enter last number: ");
        n2= input.nextInt();

        for(int i=n1; i<=n2; i++) {
            for(int j=1; j<=10; j++) {
                System.out.println(i+ "x" +j + "=" +i*j);
            }
            System.out.println();
        }

    }
}

