import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTimeClass {
    public static void main(String[] args) {
        //date
        Date date= new Date();
        System.out.println(date);

        //date format
        DateFormat datefrmt= new SimpleDateFormat("dd/MM/YYY");
        String current_date= datefrmt.format(date);
        System.out.println("Current date: "+current_date); 
        
        //time
        LocalTime time= LocalTime.now();
        System.out.println(time);

        //time format
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("hh:mm:ss");
        String current_time= formatter.format(time);
        System.out.println("Curren time: "+current_time);
    }
}
