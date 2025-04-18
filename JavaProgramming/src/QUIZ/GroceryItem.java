package QUIZ;
import java.util.ArrayList;

public class GroceryItem {
    public static void main(String[] args) {
        ArrayList<String> grocery= new ArrayList<>();   
        
        grocery.add("Onion");
        grocery.add("Potato");
        grocery.add("Rice");
        grocery.add("Oil");
        grocery.add("Vegetable");

        System.out.println("Cart:");
        for(String x: grocery) {
            System.out.println(x);
        }

        grocery.remove("Rice");

        grocery.set(1, "lentil");
        System.out.println("Updated Cart: "+grocery);

        boolean check= grocery.contains("Banana");
        System.out.println("Banana is available? "+check);


    }

}
