import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList <Integer> number= new ArrayList<Integer>();
        System.out.println("size: " +number.size()); //size of the arraylist

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(2, 40);

        //print elements
        System.out.println("Method1: " +number); //print method1
        System.out.println("size: " +number.size()); 
        
        //print method2(for each loop)
        System.out.print("For each loop method: "); 
        for(int x: number) {  
            System.out.print(x+" ");      
        }
        System.out.println();

        //print method3(iterator)
        System.out.print("Iterator method: ");
        Iterator itr= number.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        //check array empty or not
        boolean check= number.isEmpty();
        System.out.println("Array list empty: "+check);

        //find contain(value is available or not by ture/false)
        boolean contain= number.contains(50);
        System.out.println("50 is in the array: "+contain);

        //find index
        int position= number.indexOf(30);
        System.out.println("Index of 40 is: "+position);

        //replace or change number(set value)
        number.set(2, 50);
        System.out.println("After setting: "+number);

        //access/extract number(get value)
        System.out.println("Index 1: "+number.get(1));

        //removing elements
        number.remove(3);
        System.out.print("After removing: "+number);
        System.out.println();
        number.removeAll(number); //remove all number
        System.out.print("After removing all: "+number);
        System.out.println();


    }
    
}
