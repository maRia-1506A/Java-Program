import java.util.*;

public class ArrayEven {
    public static void main(String[] args) {
        int size;
        System.out.print("Enter size: ");
        Scanner input= new Scanner(System.in);
        size= input.nextInt();

        int[] arr= new int[size];
        System.out.println("Enter the values of array:");
        for(int i=0; i<size; i++) {
            System.out.print("A[" +i+ "]:");
            arr[i]= input.nextInt();
        }
        
        System.out.println("Even numbers are:");
        for(int i=0; i<size; i++) {
            if(arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
