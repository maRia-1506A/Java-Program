//Question 4: Classroom Marks Manager

import java.util.ArrayList;

public class MarksManager {
    public ArrayList <Integer> marks= new ArrayList<>();

    //method addMark
    public void addMark(int mark) {
        marks.add(mark);
        System.out.println("Marks are added: "+mark);
    }

    //method displayMarks
    public void displayMarks() {
        System.out.println("All marks: "+marks);
    }

    //method updateMark
    public void updateMark(int index, int newMark) {
        marks.set(index, newMark);
        System.out.println("Updated mark: "+marks);
    }

    //method removeMark
    public void removeMark(int index) {
        marks.remove(index);
        System.out.println("Removed mark by index: "+marks);
    }
    
    //method removeMark
    public void removeMark(Integer value) {
        marks.remove(value);
        System.out.println("Removed mark by value: "+marks);
    }

    //method calculateAverage
    public double calculateAverage() {
        int sum=0;
        for(int x: marks) {
            sum = sum + x;
        }
        return (double)sum / marks.size();
    }
}
