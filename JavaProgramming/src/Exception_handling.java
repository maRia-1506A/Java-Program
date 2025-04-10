import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        System.out.println("My program starts frome here...");

        int arr[] = { 10, 20, 30 };
        int x = 10;
        String str = null;

        System.out.println("Enter the number you want to devide by: ");
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();

        System.out.println("Enter an index value: ");
        int index = input.nextInt();

        System.out.println("Enter amount in tk: ");
        double tk = input.nextDouble();

        // runtime exception
        try {
            System.out.println("Result: " + (x / y));
            System.out.println("The element of the index is: " + arr[index]);
            System.out.println("Before nested try-catch");

            // check-exception class
            System.out.println(Class.forName("Debugging"));

            //method
            withdraw(tk);

            try { // nested try-catch
                System.out.println(str.charAt(0));
            } catch (NullPointerException ex) {
                System.out.println("Inside nested try-catch");
                System.out.println(ex);
            }
            System.out.println("After nested try-catch");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Enter a valid index");
            System.out.println(ex);
        } catch (ArithmeticException ex) {
            System.out.println("Enter another number which is not zero");
            System.out.println(ex);
        } catch (ClassNotFoundException ex) { // check-exception corresponding catch
            System.out.println("Your class is not found");
        } catch (NotEnoughMoney ex) {
            System.out.println("Im inside custome exception catch");
            System.out.println(ex.getMessage());
        }

        System.out.println("My program ends here...");
    }

    // method
    public static void withdraw(double tk) throws NotEnoughMoney{
        if(tk <= 0) {
            throw new NotEnoughMoney("You do not have enough money"); //object
        } else {
            System.out.println("Withdrawn confirmed");
        }
    }
}

// custome exception
class NotEnoughMoney extends Exception { // all exception class ar parent class "Exception" thats why extends
    // constractor
    NotEnoughMoney(String s) { //s=not enough money(parameter)
        super(s); //exception k call jbe
    }
}