package Final_Method;

public class Student extends University {
    
    void display2() {
        System.out.println("Student info");
    }

    public static void main(String[] args) {
        Student s1= new Student();
        s1.display();
        s1.display2();
    }
}
