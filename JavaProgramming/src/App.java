import java.lang.*;

public class App{
    public static void main(String[] args) {
        int x=10, y=20, z=30;
        int max= Math.max(x, Math.max(y,z));
        int min= Math.min(10, Math.min(y, z));

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}