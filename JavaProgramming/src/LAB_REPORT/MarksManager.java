//Question 4: Classroom Marks Manager

import java.util.ArrayList;
import java.util.Collections;

public class MarksManager {
    public ArrayList <Integer> marks= new ArrayList<>();

    //method addMark
    public void addMark(int mark) {
        marks.add(mark);
        System.out.println("Added marks: "+mark);
    }

    //method displayMarks
    public void displayMarks() {
        System.out.println("Output: "+marks);
        System.out.println();
    }

    //method updateMark
    public void updateMark(int index, int newMark) {
        marks.set(index, newMark);
        System.out.println("Updated mark: "+marks);
    }

    //method removeMark by index
    public void removeMark(int index) {
        marks.remove(index);
        System.out.println("Removed mark by index: "+marks);
    }
    
    //method removeMark by value
    public void removeMark(Integer value) {
        marks.remove(value);
        System.out.println("Removed mark by value: "+marks);
    }

    //method calculateAverage
    public void calculateAverage() {
        int sum=0;
        for(int x: marks) {
            sum = sum + x;
        }
        System.out.println("Average: "+(double)sum/marks.size());
    }

    //method searchMark
    public void searchMark(int mark) {
        System.out.println("Mark found: "+marks.contains(mark));
    }

    //method getMaxMark
    public void getMaxMark() {
        int max= Collections.max(marks);
        System.out.println("Highest marks: "+max);
    }

    //method getMinMark
    public void getMinMark() {
        int min= Collections.min(marks);
        System.out.println("Lowest marks: "+min);
    }

    //method sortAscending
    public void sortAscending() {
        Collections.sort(marks);
        System.out.println("Marks in Ascending Order: "+marks);
    }

    //method sortDescending
    public void sortDescending() {
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("MArks in Descending Order: "+marks);
    }
} 

class Mainn {
    public static void main(String[] args) {
        MarksManager manager= new MarksManager();

        manager.addMark(85);
        manager.addMark(90);
        manager.addMark(75);
        manager.addMark(100);
        manager.displayMarks();
        
        manager.updateMark(1, 95);
        manager.displayMarks();

        manager.removeMark(3);
        manager.displayMarks();
        manager.removeMark(Integer.valueOf(75));
        manager.displayMarks();

        manager.searchMark(100);
        manager.displayMarks();

        manager.calculateAverage();
        manager.getMaxMark();
        manager.getMinMark();
        manager.sortAscending();
        manager.sortDescending();

        manager.searchMark(95);
    }
}
