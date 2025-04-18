package FINAL_PROBLEM_SOLVE_SPRING;

public class Student {
    private String name;
    private double grade;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class Main {
    public static void main(String[] args) {
        Student student= new Student();
        student.setName("Alice Wonderland");
        student.setGrade(95.5);
        student.setAge(20);

        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("Garde: "+student.getGrade());
    }
}
