// import java.util.Scanner;
// public class Area {
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         double a, b, areaTriangle, areaCircle;
//         System.out.print("Enter the the length & wudth: ");
//         a= input.nextDouble();
//         b= input.nextDouble();

//         areaTriangle= .5* a* b;
//         areaCircle= 3.1416*a*a;

//         System.out.println("Triangle: " +areaTriangle);
//         System.out.println("Circle: " +areaCircle);
//     }
    
// }


//temparature convert
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int celcius;
        System.out.print("Enter the temaprature in celcius: ");
        celcius= input.nextInt();

        double temaprature= (1.8*celcius) +32;
        System.out.println("The Fahrenheight temparature: " +temaprature);
}
}
