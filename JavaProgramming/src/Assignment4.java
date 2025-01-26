import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int phonePrice= 1800;
        int numofInstallment, installmentperMonth;

        System.out.print("Number of installment: ");
        numofInstallment= input.nextInt();
        installmentperMonth= phonePrice/numofInstallment;
        System.out.println("Monthly installment ammount: " +installmentperMonth +"$");

    }   
}
