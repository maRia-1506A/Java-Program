// public class ArraySum {
//     public static void main(String[] args) {
//         int[] number= new int[5]; //declaration & creation
//         number[0]= 10;
//         number[1]= 20;
//         number[2]= 30;
//         number[4]= 40;

//         System.out.println("the length: " +number.length);  //length
//     }
// }


//Sum & avg of array
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double[] number= new double[5]; //declaration & creation
        System.out.println("Enter 5 numbers: ");
        double sum=0;;

        //input number
        for(int i=0; i<5; i++) {
            System.out.print("number["+i+"]: ");
            number[i]= input.nextDouble();
        }
        //input sum
        for(int i=0; i<5; i++) {
            sum= sum + number[i];
        }
        System.out.println("the length: " +number.length);  //length
        System.out.println("the sum: " +sum);  //sum
       
        double avg=sum/number.length;
        System.out.println("the avg: " +avg);  //avg
    }
}

