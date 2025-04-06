import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> number1= new ArrayList<>();
        ArrayList<Integer> number2= new ArrayList<>();
        ArrayList<Integer> number3= new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("Number 1: "+number1);

        number2.add(1);
        number2.add(3);
        number2.add(2);
        number2.add(4);
        System.out.println("Number 2: "+number2);

        //max min
        int max= Collections.max(number1);
        int min= Collections.min(number1);
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);

        //sorting
        Collections.sort(number2);
        System.out.println("Afrter sorting: "+number2);

        //sorting (reversed)
        Collections.sort(number2, Collections.reverseOrder());
        System.out.println("Reverse order: "+number2);

        //addAll (sb add kre dbe)
        number3.addAll(number1);
        System.out.println("Number 3: "+number3);

        //equals(equal kina)
        System.out.println("Number 1 == Number 2: "+number1.equals(number2));
        System.out.println("Number 1 == Number 3: "+number1.equals(number3));

        //printing number normally
        System.out.println("Number 1 using loop: ");
        for(int i=0; i<number1.size(); i++) {
            System.out.println(number1.get(i));
        }
        System.out.println("Number 2 using for each loop: ");
        for(int x: number2) {  //for each loop
            System.out.println(x);
        }

        //every element compare
        for(int i=0; i<number1.size(); i++) {
            if(number1.get(i).equals(number2.get(i))) {
                System.out.println(number1.get(i)+" and "+number2.get(i)+" is equal");
            } else {
                System.out.println(number1.get(i)+" and "+number2.get(i)+" is not equal");
            }
        }
    } 
}
