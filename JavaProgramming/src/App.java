import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n, first, second, fibo;
        System.out.print("Enter fibonacci number: ");
        n= input.nextInt();
        first= 0;
        second= 1;
        System.out.print(+first+" "+second);  

        for(int i=3; i<=n; i++) {
            fibo= first + second;
            first= second;
            second= fibo;
            System.out.print(" "+fibo);
        }
    }
}
