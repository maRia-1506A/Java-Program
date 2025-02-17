//any to decimal
// import java.util.*;

// public class Numb_conversion {
//     public static void main(String[] args) {
//         String binary, octal, hexa;
//         System.out.print("Enter any conversion number: ");
//         Scanner input= new Scanner(System.in);
//         binary= input.nextLine();
//         octal= input.nextLine();
//         hexa= input.nextLine();
        
//         Integer decimal = Integer.parseInt(binary,2);
//         System.out.println("Decimal value for binary: "+decimal);

//         Integer decimal1 = Integer.parseInt(octal,8);
//         System.out.println("Decimal value for octal: "+decimal1);

//         Integer decimal2 = Integer.parseInt(hexa,16);
//         System.out.println("Decimal value for hexa: "+decimal2);
//     }
// }


//deciaml to any
import java.util.*;

public class Numb_conversion {
    public static void main(String[] args) {
        int decimal;
        System.out.print("Enter any conversion number: ");
        Scanner input= new Scanner(System.in);
        decimal= input.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary value for decimal: "+binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal value for decimal: "+octal);
        
        String hexa = Integer.toHexString(decimal);
        System.out.println("Hexa value for decimal: "+hexa);
    }
}
