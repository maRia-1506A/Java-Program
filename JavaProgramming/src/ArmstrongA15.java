// import java.util.Scanner;

// public class ArmstrongA15 {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         int number, sum=0, remainder, temp;
//         System.out.print("Enter the number: ");
//         number= input.nextInt();

//         temp= number;
//         while(temp!=0) {
//             remainder= temp % 10;
//             sum= sum + (remainder * remainder * remainder);
//             temp= temp/10;
//         }
//         if(sum == number) {
//             System.out.print(number +" is an armstrong number");
//         } else {
//             System.out.print(number +" is not an armstrong number");            
//         }
//     }  
// }


//armstrong number in a range, count & sum
import java.util.Scanner;

public class ArmstrongA15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int m, n, sum=0, remainder, temp, i, totalarmstrongnumber=0, totalsum=0;
        System.out.print("Start number: ");
        m= input.nextInt();
        System.out.print("End number: ");
        n= input.nextInt();
        System.out.print("Armstrong number from" +m +" to " +n +" are: ");

        for(i=m; i<=n; i++) {
            sum=0;
            temp= i;
            while (temp!=0) {
                remainder= temp % 10;
                sum= sum + (remainder * remainder * remainder);
                temp= temp / 10;                
            }
            if(sum == i) {
                System.out.print(i +" ");
                totalarmstrongnumber++;
                totalsum= totalsum + i;
            }
        }
        System.out.println("\nTotal Amstrong number: " +totalarmstrongnumber);
        System.out.println("Total sum of Amstrong number: " +totalsum);
    }
}