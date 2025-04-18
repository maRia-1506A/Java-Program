package FINAL_PROBLEM_SOLVE_FALL;
import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException(String s) {
        super(s);
    }
}

class IOException extends Exception {
    IOException(String s) {
        super(s);
    }
}

public class Library {
   public int age;

   public static void checkAge(int age) throws UnderAgeException, IOException{
    if(age<12) {
        throw new UnderAgeException("UnderAgeException");
    } else if(age>30) {
        throw new IOException("User is old enough.");
    } else {
        System.out.println("Congratulations! Your age is perfect");
    }
   }

   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    try{
        System.out.println("Enter age: ");
        int age= sc.nextInt();
        
        checkAge(age);    
    } catch(UnderAgeException ex) {
        System.out.println(ex);
    } catch(IOException ex) {
        System.out.println(ex);
    }
   }
}

