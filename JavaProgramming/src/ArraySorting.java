import java.util.*;

public class ArraySorting {
    public static void main(String[] args) {
        int[] number= {-8,100,5,9,45,10}; //length=6
        Arrays.sort(number);

        System.out.println("Ascending: ");
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
        System.out.println("Descending: ");
        for(int i=number.length-1; i>=0; i--) {
            System.out.print(number[i]+" ");
        }
        System.out.println();

        String[] name= {"maria", "walid", "efath", "sumaiya","ashraf"};
        Arrays.sort(name);
        for(int i=0; i<name.length; i++) {
            System.out.print(name[i]+" ");
        }
        System.out.println();
        for(int i=name.length-1; i>=0; i--) {
            System.out.print(name[i]+" ");
        }
    }
    
}
