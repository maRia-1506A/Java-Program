package QUIZ;

import java.util.ArrayList;
import java.util.Collections;

public class ArraY {
    public static void main(String[] args) {
        ArrayList<String> CapstoneProjectGropup = new ArrayList<>();
        ArrayList<String> OOPProjectGropup = new ArrayList<>();

        CapstoneProjectGropup.add("Mika");
        CapstoneProjectGropup.add("Mina");
        CapstoneProjectGropup.add("Rasel");
        CapstoneProjectGropup.add("Rony");
        CapstoneProjectGropup.add("Jack");

        OOPProjectGropup.add("Jack");
        OOPProjectGropup.add("Rasel");
        OOPProjectGropup.add("Tony");
        OOPProjectGropup.add("Mike");
        OOPProjectGropup.add("Mina");

        Collections.sort(CapstoneProjectGropup);
        System.out.println("Capstone project: " + CapstoneProjectGropup);
        Collections.sort(OOPProjectGropup);
        System.out.println("OOP Group: " + OOPProjectGropup);

        System.out.println("Groups are equal: "+CapstoneProjectGropup.equals(OOPProjectGropup));

        // for (int i = 0; i < CapstoneProjectGropup.size(); i++) {
        //     if ((CapstoneProjectGropup.get(i)).equals(OOPProjectGropup.get(i))) {
        //         System.out.println(CapstoneProjectGropup.get(i) + " and " + OOPProjectGropup.get(i) + " is equal");
        //     } else {
        //         System.out.println(CapstoneProjectGropup.get(i) + " and " + OOPProjectGropup.get(i) + " is not equal");
        //     }
        // }

        System.out.println("Member in cp: " + CapstoneProjectGropup.contains("Alice"));
        System.out.println("Member in OOP: " + OOPProjectGropup.contains("Alice"));
    }
}
