import java.util.ArrayList;
import java.util.Collections;

public class Arraylistsorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(80);
        number.add(-20);
        number.add(600);
        number.add(107);
        number.add(-210);

        System.out.println("Before soting: "+number);
        Collections.sort(number);
        System.out.println("After soting in Ascending: "+number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After sorting in Descending: "+number);

    }
    
}
