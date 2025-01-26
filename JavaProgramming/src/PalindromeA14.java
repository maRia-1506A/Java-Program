// import java.util.Scanner;

// public class PalindromeA14 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int number, remainder, sum=0, temp;
//         System.out.print("The original number: ");
//         number= input.nextInt();

//         temp= number;
//         while(temp!=0) {
//             remainder= temp % 10;
//             sum= sum * 10 + remainder;
//             temp= temp / 10;
//         }
//         System.out.println("The reverse number: " +sum);

//         if(number == sum) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }  
// }


//palindrome in range, count & sum
import java.util.Scanner;

public class PalindromeA14 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1, n2, temp, sum=0, totalpalindromenumber=0, remainder, i;
        int totalsum=0; //for sum of palindrome & sum=0 is for sum in the loop

        System.out.print("Enter start number: ");
        n1= input.nextInt();
        System.out.print("Enter end number: ");
        n2= input.nextInt();
        System.out.print("Palindrom numbers from "+n1 +" to " +n2 +" are: ") ;

        for(i=n1; i<=n2; i++) {
            sum=0;
            temp= i;
            while(temp!=0) {
                remainder= temp%10;
                sum= sum*10 + remainder;
                temp=temp/10;
            }
            if(sum == i) {
                System.out.print(i +" ");
                totalpalindromenumber++;
                totalsum= totalsum+i;
            }
        }
        System.out.println("\nTotal number: " +totalpalindromenumber);
        System.out.println("Total sum of palindrome: " +totalsum);


    }
}