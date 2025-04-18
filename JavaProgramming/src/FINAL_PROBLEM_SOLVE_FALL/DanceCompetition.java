package FINAL_PROBLEM_SOLVE_FALL;

import java.util.ArrayList;
import java.util.Collections;

public class DanceCompetition {
    public static void main(String[] args) {
        ArrayList<String> CityA = new ArrayList<>();
        ArrayList<String> CityB = new ArrayList<>();

        CityA.add("Sophia");
        CityA.add("Emma");
        CityA.add("Olivia");
        CityB.add("Liam");
        CityB.add("Noah");
        CityB.add("Ava");

        ArrayList<String> FinalList = new ArrayList<>();
        FinalList.addAll(CityA);
        FinalList.addAll(CityB);

        FinalList.remove(FinalList.size() - 1);

        System.out.println("CityA:");
        for (String x : CityA) {
            System.out.println(x);
        }
        System.out.println("City B:");
        for (String y : CityB) {
            System.out.println(y);
        }
        System.out.println("Final list:");
        for (String z : FinalList) {
            System.out.println(z);
        }

        if (FinalList.contains("Sophia")) {
            System.out.println("Index no " + FinalList.indexOf("Sophia") + " Sophia is ready to dance!");
        } else {
            System.out.println("Sophia is not in the competition");
        }

        Collections.sort(FinalList);
        System.out.println("Sorting: " + FinalList);

        System.out.println("Total number: " + FinalList.size());

    }
}
