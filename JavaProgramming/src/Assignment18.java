//weekday
import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int day_numb;
        String[] day= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
        System.out.print("Enter day number(1-7): ");
        day_numb= input.nextInt();

        for(int i=0; i<day.length; i++) {
            if(day_numb == i+1) { //normally sunday[0]; i+1= sunday[1]
                System.out.println(day[i]);
            }
        }
    }
}
