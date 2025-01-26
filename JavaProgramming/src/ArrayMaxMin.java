import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double[] number= new double[5]; //declaration & creation
        System.out.println("Enter 5 numbers: ");
        double sum=0;;

        //input number
        for(int i=0; i<number.length; i++) {
            System.out.print("number["+i+"]: ");
            number[i]= input.nextDouble();
        }
        double max= number[0];
        double min= number[0];
        for(int i=1; i<number.length; i++) {
            if(max<number[i]) {
                max= number[i];
            }
            if(min>number[i]) {
                min= number[i];
            }
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
    }
}
