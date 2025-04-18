package QUIZ;
import java.util.ArrayList;
import java.util.Iterator;
public class VolunteerTrackingSystem {
    public static void main(String[] args) {

        ArrayList<String> teamA= new ArrayList<>();
        ArrayList<String> teamB= new ArrayList<>();
    
        teamA.add("Arif");
        teamA.add("Borna");
        teamA.add("Tanvir");
        teamA.add("Sneha");
        teamB.add("Sneha");
        teamB.add("Mithila");
        teamB.add("Tanvir");
        teamB.add("Hasib");

        System.out.println("Common members:");
        for(String member : teamA) {
            if(teamB.contains(member)) {
                System.out.println(member);
            }
        }

        teamA.addAll(teamB);
        System.out.println(teamA);

        System.out.println("Index of Tanvir: "+teamA.indexOf("Tanvir"));

        teamA.set(2, "Tariq");
        System.out.println("Updated list 1: "+teamA);

        teamA.remove(3);
        System.out.println("Updated list 2: "+teamA);

        System.out.println("TeamB is empty: "+teamB.isEmpty());

        System.out.println("Volunteer of index 4: "+teamA.get(4));

        Iterator volunteer= teamA.iterator();
        while(volunteer.hasNext()) {
            System.out.println(volunteer.next());
        }
    }
}
