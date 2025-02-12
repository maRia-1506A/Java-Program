import java.util.Scanner;
public class StringPalindrom {
        public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String str1;
        System.out.print("Enter any string: ");
        str1= input.nextLine();

        StringBuffer sb= new StringBuffer(str1);
        String str2 = sb.reverse().toString(); //string bffer k string e convert krar jnne tostring newa

        if(str1.equals(str2)) {
            System.out.println("Palindrome\n");
        } else {
            System.out.println("Not palindrome\n");
        }
    }
}
